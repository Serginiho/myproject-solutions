package com.homecompany.chapter19.exercise11;

import java.util.EnumMap;

interface StateInterface2{
    void next(ExtendedInput input, VendingMachine2 vm);
    void next(VendingMachine2 vm);
    void output();
}

enum State2 {
    RESTING,
    ADDING_MONEY,
    DISPENSING(StateDuration2.TRANSIENT),
    GIVING_CHANGE(StateDuration2.TRANSIENT),
    TERMINAL;
    private boolean isTransient = false;
    State2() {}
    State2(StateDuration2 trans) { isTransient = true; }
    static void output(VendingMachine2 vm) { System.out.println(vm.machines.amount);}
    public static EnumMap<State2, StateInterface2> states = new EnumMap<>(State2.class);
    static {
        states.put(RESTING, new StateInterface2() {
            @Override
            public void next(ExtendedInput input, VendingMachine2 vm) {
                switch(Category2.categorize(input.input2)) {
                    case MONEY:
                        vm.machines.amount += input.amount();
                        vm.machines.state = ADDING_MONEY;
                        break;
                    case SHUT_DOWN:
                        vm.machines.state = TERMINAL;
                    default:
                }
            }

            @Override
            public void next(VendingMachine2 vm) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void output() {
                throw new UnsupportedOperationException();
            }
        });
        states.put(ADDING_MONEY, new StateInterface2() {
            @Override
            public void next(ExtendedInput input, VendingMachine2 vm) {
                switch(Category2.categorize(input.input2)) {
                    case MONEY:
                        vm.machines.amount += input.amount();
                        break;
                    case ITEM_SELECTION:
                        vm.machines.selection = input;
                        if(vm.machines.amount < vm.machines.selection.amount())
                            System.out.println("Insufficient money for " + vm.machines.selection);
                        else vm.machines.state = DISPENSING;
                        break;
                    case QUIT_TRANSACTION:
                        vm.machines.state = GIVING_CHANGE;
                        break;
                    case SHUT_DOWN:
                        vm.machines.state = TERMINAL;
                    default:
                }
            }

            @Override
            public void next(VendingMachine2 vm) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void output() {
                throw new UnsupportedOperationException();
            }
        });
        states.put(DISPENSING, new StateInterface2() {
            @Override
            public void next(ExtendedInput input,VendingMachine2 vm) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void next(VendingMachine2 vm) {
                System.out.println("here is your " + vm.machines.selection);
                vm.machines.amount -= vm.machines.selection.amount();
                vm.machines.state = GIVING_CHANGE;
            }

            @Override
            public void output() {
                throw new UnsupportedOperationException();
            }
        });
        states.put(GIVING_CHANGE, new StateInterface2() {
            @Override
            public void next(ExtendedInput input, VendingMachine2 vm) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void next(VendingMachine2 vm) {
                if(vm.machines.amount > 0) {
                    System.out.println("Your change: " + vm.machines.amount);
                    vm.machines.amount = 0;
                }
                vm.machines.state = RESTING;
            }

            @Override
            public void output() {
                throw new UnsupportedOperationException();
            }
        });
        states.put(TERMINAL, new StateInterface2() {
            @Override
            public void next(ExtendedInput input, VendingMachine2 vm) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void next(VendingMachine2 vm) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void output() {
                System.out.println("Halted");
            }
        });
    }

    public boolean isTransient() {
        return isTransient;
    }
}
