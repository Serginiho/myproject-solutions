package com.homecompany.chapter12.exercise29;

class BaseballException extends RuntimeException {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
    Inning() throws BaseballException {}
    void event() throws BaseballException {
        // Doesn't actually have to throw anything
    }
    abstract void atBat() throws Strike, Foul;
    void walk() {} // Throws no checked exceptions
}

class StormException extends RuntimeException {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    void event() throws RainedOut;
    void rainHard() throws RainedOut;
}
class StormyInning extends Inning implements Storm {
    // OK to add new exceptions for constructors, but you
    // must deal with the base constructor exceptions:
    public StormyInning()
            throws RainedOut, BaseballException {}
    public StormyInning(String s)
            throws Foul, BaseballException {}
    @Override
    void walk() {}
    // Interface CANNOT add exceptions to existing
    // methods from the base class:
    @Override
    public void event() {}
    // If the method doesn't already exist in the
    // base class, the exception is OK:
    @Override
    public void rainHard() {}
    // You can choose to not throw any exceptions,
    // even if the base version does:
   /* @Override
    public void event() {}*/
    // Overridden methods can throw inherited exceptions:
    @Override
    void atBat() {
        throw new PopFoul();
    }
    public static void main(String[] args) {
      //  try {
            StormyInning si = new StormyInning();
            si.atBat();
       /* } catch(PopFoul e) {
            System.out.println("Pop foul");
        } catch(RainedOut e) {
            System.out.println("Rained out");
        } catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }*/
        // Strike not thrown in derived version.
     //   try {
            // What happens if you upcast?
            Inning i = new StormyInning();
            i.atBat();
            // You must catch the exceptions from the
            // base-class version of the method:
       /* } catch(Strike e) {
            System.out.println("Strike");
        } catch(Foul e) {
            System.out.println("Foul");
        } catch(RainedOut e) {
            System.out.println("Rained out");
        } catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }*/
    }
}
