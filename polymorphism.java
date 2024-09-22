package oops;

class buffalow {
    public void sound() {
        System.out.println(" Buffalow makes a sound.");
    }
}

class OX extends buffalow {

    public void sound() {
        System.out.println("The OX Barks.");
    }
}

public class polymorphism {

    public static void main(String[] args) {
        buffalow myAnimal = new OX();
        myAnimal.sound();
    }
}
