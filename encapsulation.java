package oops;

class student {
    private int ID;
    private String name;

    student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getId() {
        return ID;
    }

    public String getName() {
        return name;
    }
}

public class encapsulation {

    public static void main(String[] args) {

        student s = new student(45, "Rohitsharma");

        String name = s.getName();
        int ID = s.getId();

        System.out.println(name + " ----- > " + ID);
    }
}
