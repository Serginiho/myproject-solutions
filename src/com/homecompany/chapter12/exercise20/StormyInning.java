package com.homecompany.chapter12.exercise20;

class StormyInning extends Inning implements Storm {
    StormyInning() throws RainedOut, BaseballException {
    }
    StormyInning (String s) throws Foul, BaseballException {
    }

  /*  @Override
    void walk() throws PopFoul {
        super.walk();
    }*/ // Метод должен соответствовать базову классу, в базовом классе метод не кидает контралируемые исключения

    @Override
    void atBat() throws PopFoul {
        throw new PopFoul();

    }

    @Override
    void run() throws GameException {
        throw new GameException();
    }

    @Override
    public void event() {

    }

    @Override
    public void rainHard() throws RainedOut {
    }
    public static void main (String [] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        }catch (PopFoul popFoul) {
            System.out.println("Pop Foul");
        } catch (RainedOut rainedOut) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        } finally {
            try {
                StormyInning si = new StormyInning();
                si.run();
            } catch (GameException e) {
                System.out.println("Game exception");
            } catch (RainedOut rainedOut) {
                System.out.println("Rained out");
            } catch (BaseballException e) {
                System.out.println("Generic baseball exception");
            }
        }
        try {
            Inning i = new StormyInning();
            i.atBat();

        } catch (Strike strike) {
            System.out.println("Strike");
        } catch (Foul foul) {
            System.out.println("Foul");
        } catch (RainedOut rainedOut) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }finally {
            try {
                Inning i = new StormyInning();
                i.run();
            }catch (UmpireException u){
                System.out.println("Umpire exception");
            }  catch (RainedOut rainedOut) {
                System.out.println("Rained out");
            }catch (BaseballException e) {
                System.out.println("Generic baseball exception");
            }
        }
    }
}
