package de.tuberlin.sbe.prog1winf.exceptions;

import Prog1Tools.IOTools;

public class ExceptionBasics {
    public static void main(String[] args) throws MyOwnException {
        try {
            int res = divide();
            System.out.println(res);
        } catch (ArithmeticException | MyOwnException e ){
            if (e instanceof ArithmeticException) {
                System.out.println("Though oughta not divide by zero");
            }
            System.out.println(e.getMessage());
            e.printStackTrace();
//            throw e;
        }

        System.out.println("Calculation completed");
    }

    private static int divide() throws ArithmeticException, MyOwnException {
        int divident = IOTools.readInt("Divident: ");
        int divisor = IOTools.readInt("Divisor: ");
//        int divident = 273;
//        int divisor = 0;
        int res = divident/divisor;
        if (divisor > 0) {
            throw new MyOwnException("My custom message");
        }
        return res;
    }
}
