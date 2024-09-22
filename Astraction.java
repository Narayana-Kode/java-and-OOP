package oops;

abstract class Animal {
    abstract void makesound();

    void bark() {
        System.out.println("Dog barking");
    }
}

class Dog extends Animal {

    void makesound() {
        System.out.println("cat meow");
    }
}

public class Astraction {

    public static void main(String[] args) {

        Animal b = new Dog();

        b.bark();
        b.makesound();
    }
}
