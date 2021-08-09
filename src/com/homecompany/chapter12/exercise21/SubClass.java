package com.homecompany.chapter12.exercise21;

class SubClass extends PrimeClass {
    SubClass() throws Exception {
  /*      try {
            super();
        } catch (Exception e) {
            e.printStackTrace();
        }*/ //вызов родительского класса должен быть первым объявлением в конструкторе дочернего класса, поэтому внутри
        // конструктора не получится перехватить исключение возбуждаемое родительским классом
    }
}
