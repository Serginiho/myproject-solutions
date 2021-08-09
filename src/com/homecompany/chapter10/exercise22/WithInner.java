package com.homecompany.chapter10.exercise22;

class WithInner {
    class Inner {
        private int s;
        Inner (int i){
            this.s = i;
        }

        @Override
        public String toString() {
            return "Inner{" +
                    "s=" + s +
                    '}';
        }
    }
}
