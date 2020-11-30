package de.tuberlin.sbe.prog1winf.objectOrientedProgramming;

public class Cat extends Animal{
    private String name;

    public static void main(String[] args){
        Animal a = new Animal();
//        Cat c = a.getCat();
        Cat c = new Cat("Caesar", 40);
        System.out.println(c);
//        Animal a = c;
        System.out.println(c.size);
        System.out.println(a.size);
//        System.out.println(a.name);
    }

    public Cat(String name, int size) {
        this.name = name;
        this.size = size;
        this.age = 0;
    }

    public String toString() {
        String str = "Name of the cat: " + this.name + " ; Size: " + this.size;
        return str;
    }
}