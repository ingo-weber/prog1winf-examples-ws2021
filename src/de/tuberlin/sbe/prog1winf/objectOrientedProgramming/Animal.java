package de.tuberlin.sbe.prog1winf.objectOrientedProgramming;

public class Animal {
    public double size;
    protected int age;
    private boolean isAlive;
    private Cat myCat;

    public Animal() {
        System.out.println("Constructor without parameters in Animal");
    }

    public Animal(double size, int age, boolean isAlive) {
        this.size = size;
        this.age = age;
        this.isAlive = isAlive;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                ", age=" + age +
                ", isAlive=" + isAlive +
                "}";
//                "}; it is also an " + super.toString();
    }

    public Cat getCat() {
        return myCat;
    }
}
