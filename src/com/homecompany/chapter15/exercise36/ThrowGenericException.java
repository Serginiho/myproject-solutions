package com.homecompany.chapter15.exercise36;

class ThrowGenericException {
    public static void main(String[] args) {
        ProcessRunner<String, Failure1, Failure2> pr = new ProcessRunner<>();
        for (int i = 0; i < 2; i++) {
        pr.add(new Processor1());
        }

        try {
            System.out.println(pr.processAll());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
