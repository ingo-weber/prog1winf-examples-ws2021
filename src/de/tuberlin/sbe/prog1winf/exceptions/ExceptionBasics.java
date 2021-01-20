package de.tuberlin.sbe.prog1winf.exceptions;

import Prog1Tools.IOTools;

public class ExceptionBasics {
    public static void main(String[] args) {
        try {
            int res = divide();
            System.out.println(res);
        } catch (ArithmeticException e ){
            System.out.println("Though oughta not divide by zero");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static int divide() throws ArithmeticException {
//        int divident = IOTools.readInt("Divident: ");
//        int divisor = IOTools.readInt("Divisor: ");
        int divident = 273;
        int divisor = 0;
        int res = divident/divisor;
        return res;
    }
}
