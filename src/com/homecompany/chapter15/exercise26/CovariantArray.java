package com.homecompany.chapter15.exercise26;

class CovariantArray {
    public static void main(String[] args) {
        Number[] numbers = new Integer[3];
        numbers[0] = 1; //OK
        numbers[1] = 2;
        numbers[2] = 3;
        for (Number n:
             numbers) {
            System.out.print(n + ", ");
            }
        System.out.println();
        for (Number n:
                numbers) {
            System.out.print(n.getClass().getSimpleName() + ", ");
        }
        System.out.println();
//        numbers[1] = new Byte((byte) 2); //ArrayStoreException
//        numbers[2] = 2.1; //ArrayStoreException

        Integer[] integers = (Integer[]) numbers;
        for (Integer i:
             integers) {
            System.out.print(i + ", ");
        }
    }
}
