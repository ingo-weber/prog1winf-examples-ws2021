package de.tuberlin.sbe.prog1winf.objectOrientedProgramming;

public class Cat extends Animal{
    private String name;

    public static void main(String[] args){
        Animal a = new Animal(50, 2, true);
//        Cat c = a.getCat();
        Cat c = new Cat("Caesar", 40, 1, true);
        System.out.println(c);
//        Animal a = c;
//        System.out.println(c.size);
//        System.out.println(a.size);
//        System.out.println(a.name);
    }

    public Cat(String name, double size, int age, boolean isAlive) {
//        super(size, age, isAlive);
        this.name = name;
        this.age = 0;
    }

    public String toString() {
        String str = "Name of the cat: " + this.name + " ; it is also an " + super.toString();
        return str;
    }
}