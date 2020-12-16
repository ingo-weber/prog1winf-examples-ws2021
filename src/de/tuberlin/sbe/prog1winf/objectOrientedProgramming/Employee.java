package de.tuberlin.sbe.prog1winf.objectOrientedProgramming;

public class Employee {
    static long nextID = 0;

    // the assignment should go into a constructor
    long employeeID = nextID++;

    //…
    public static void main(String[] args) {
        Employee.nextID=7;
        Employee emplA = new Employee();
        emplA.print();
        Employee emplB = new Employee();
        emplB.print();
    }

    private void print() {
        long employeeID = 0;
        System.out.println("EID: " + employeeID);
        System.out.println("EID: " + this.employeeID);
//        System.out.println("EID: " + this.employeeID + ", Name: " + this.firstName + " " + this.lastName);
    }

    //    long employeeID;
//    String lastName;
//    String firstName;

//
//    public Employee(String firstName, String lastName) {
//        if (firstName == null || firstName.length() <= 0
//                || lastName == null || lastName.length() <=0) {
//            System.out.println("Please provide first and last name");
//        }
//        this.employeeID = Employee.nextID++;
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public static void main(String[] args) {
//        Employee emplA = new Employee("Ada", "Lovelace");
//        Employee emplB = new Employee("Donald", "Knuth");
//        emplA.print();
//        emplB.print();
//
//        // Say they got married...
//        emplB.setLastName(emplA.lastName);
//        emplA.print();
//        emplB.print();
//    }
}
