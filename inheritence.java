package oops;

class A {
    public A() {

    }

    public void showA() {
        System.out.println("A show");
    }
}

class B extends A {
    public B() {

    }

    public void showB() {
        System.out.println("B show");
    }
}

public class inheritence {

    public static void main(String[] args) {

        B b = new B();

        b.showA();
        b.showB();
    }
}
