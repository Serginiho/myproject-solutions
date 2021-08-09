package com.homecompany.chapter12.exercise30;

class Human {
    void humanDo(int i) {
        try {
            switch (i) {
                case 0:
                    throw new Annoyance();
                case 1:
                    throw new Sneeze();
                case 2:
                    throw new RuntimeException("Exception");
                default:
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Human h = new Human();
        for (int i = 0; i < 4; i++) {
            try {
                if (i < 3)
                    h.humanDo(i);
                else throw new SomeOtherException();
            } catch (SomeOtherException e) {
                System.out.println("SomeOtherException" + e);
            } catch (RuntimeException re) {
                try {
                    throw re.getCause();
                } catch (Annoyance ae) {
                   System.out.println("Annoyance" + ae);
                } catch (Sneeze se) {
                    System.out.println("Sneeze" + se);
                } catch (Throwable te) {
                    System.out.println("Throwable" + te);;
                }
            }
        }
    }
}