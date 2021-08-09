package com.homecompany.chapter19.exercise10;

import util.Generator;

public class VendingMachine {
    enum Machines {
        MACHINE(State.RESTING, 0, null);
        State state;
        int amount;
        Input selection;
        Machines(State state, int amount, Input selection){
            this.state = state;
            this.amount = amount;
            this.selection = selection;
        }
    }
    Machines machines;
    static VendingMachine getM() {
        VendingMachine vm = new VendingMachine();
        vm.machines = Machines.MACHINE;
        vm.machines.state = State.RESTING;
        vm.machines.selection = null;
        vm.machines.amount = 0;
        return vm;
    }
    static long counter = 1;
    long id = counter++;
    @Override
    public String toString() {
        return machines + " " + id;
    }
    static void run (Generator<Input> gen) {
        VendingMachine vm = getM();
        System.out.println("-------------");
        System.out.println(vm);
        System.out.println("-------------");
        while (vm.machines.state != State.TERMINAL){
            State.states.get(vm.machines.state).next(gen.next(), vm);
                if (vm.machines.state == State.TERMINAL){
                    State.states.get(vm.machines.state).output();
                    break;
                }
                while (vm.machines.state.isTransient())
                    State.states.get(vm.machines.state).next(vm);
                State.output(vm);
            }
        }

    public static void main(String[] args) {
        Generator<Input> gen = new RandomInputGenerator();
        for (int i = 0; i < 3; i++) {
            if (args.length == 1)
                gen = new FileInputGenerator(args[0]);
            run(gen);
        }
    }
}
