package com.homecompany.chapter19.exercise11;

import util.Generator;
import util.TextFile;

public class VendingMachine2 {
    enum Machines {
        MACHINE(State2.RESTING, 0, null);
        State2 state;
        int amount;
        ExtendedInput selection;
        Machines(State2 state, int amount, ExtendedInput selection){
            this.state = state;
            this.amount = amount;
            this.selection = selection;
        }
    }
    Machines machines;
    static VendingMachine2 getM() {
        VendingMachine2 vm = new VendingMachine2();
        vm.machines = VendingMachine2.Machines.MACHINE;
        vm.machines.state = State2.RESTING;
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
    static void run (Generator<ExtendedInput> gen) {
        VendingMachine2 vm = getM();
        System.out.println("-------------");
        System.out.println(vm);
        System.out.println("-------------");
        while (vm.machines.state != State2.TERMINAL){
            State2.states.get(vm.machines.state).next(gen.next(), vm);
            if (vm.machines.state == State2.TERMINAL){
                State2.states.get(vm.machines.state).output();
                break;
            }
            while (vm.machines.state.isTransient())
                State2.states.get(vm.machines.state).next(vm);
            State2.output(vm);
        }
    }

    public static void main(String[] args) {
        if (args.length == 2) {
            for (int i = 0; i < 3; i++) {
                Generator<ExtendedInput> gen = new FileInputGenerator2(args[0]);
                for (String s :
                        new TextFile(args[1], "\n")) {
                    ItemToSell.addItem(ItemToSell.parse(s));
                }
                run(gen);
            }
        } else {
        System.err.println("Input item to sell");
        }
    }
}
