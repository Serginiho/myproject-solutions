package com.homecompany.chapter19.exercise10;

import java.util.EnumMap;

interface StateInterface{
    void next(Input input, VendingMachine vm);
    void next(VendingMachine vm);
    void output();
}

enum State {
    RESTING,
    ADDING_MONEY,
    DISPENSING(StateDuration.TRANSIENT),
    GIVING_CHANGE(StateDuration.TRANSIENT),
    TERMINAL;
    private boolean isTransient = false;
    State() {}
    State(StateDuration trans) { isTransient = true; }
    static void output(VendingMachine vm) { System.out.println(vm.machines.amount);}
    public static EnumMap<State, StateInterface> states = new EnumMap<>(State.class);
    static {
        states.put(RESTING, new StateInterface() {
            @Override
            public void next(Input input, VendingMachine vm) {
                switch(Category.categorize(input)) {
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
            public void next(VendingMachine vm) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void output() {
                throw new UnsupportedOperationException();
            }
        });
        states.put(ADDING_MONEY, new StateInterface() {
            @Override
            public void next(Input input, VendingMachine vm) {
                switch(Category.categorize(input)) {
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
            public void next(VendingMachine vm) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void output() {
                throw new UnsupportedOperationException();
            }
        });
        states.put(DISPENSING, new StateInterface() {
            @Override
            public void next(Input input, VendingMachine vm) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void next(VendingMachine vm) {
                System.out.println("here is your " + vm.machines.selection);
                vm.machines.amount -= vm.machines.selection.amount();
                vm.machines.state = GIVING_CHANGE;
            }

            @Override
            public void output() {
                throw new UnsupportedOperationException();
            }
        });
        states.put(GIVING_CHANGE, new StateInterface() {
            @Override
            public void next(Input input, VendingMachine vm) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void next(VendingMachine vm) {
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
        states.put(TERMINAL, new StateInterface() {
            @Override
            public void next(Input input, VendingMachine vm) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void next(VendingMachine vm) {
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
