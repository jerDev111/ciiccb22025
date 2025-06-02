package TaskActivities;

public class Task14 {
    public static void main(String[] args) {
        B instanceB = new B();
        instanceB.abstractMethod();
        instanceB.concreteMethod();

        C instanceC = new C();
        instanceC.abstractMethod();
        instanceC.concreteMethod();
    }
}

abstract class AbstractBase {
    abstract void abstractMethod();

    void concreteMethod() {
        System.out.println("This is a concrete method.");
    }
}

class B extends AbstractBase {
    @Override
    void abstractMethod() {
        System.out.println("B's implementation of abstractMethod.");
    }
}

class C extends AbstractBase {
    @Override
    void abstractMethod() {
        System.out.println("C's implementation of abstractMethod.");
    }
}
