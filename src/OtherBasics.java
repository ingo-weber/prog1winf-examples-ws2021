import Prog1Tools.IOTools;

public class OtherBasics {

    public static void main(String[] args) {
        //Strings (Text)
        String hello = "hello";
        System.out.println(hello);
        hello = "Pudding";
        System.out.println(hello);
        hello = "Hello " + hello;
        System.out.println(hello);
        System.out.println("------------");

        int a = 4;
        int b = 10;
        int c = 16;
        a = b = c = 5;
        System.out.println("abc=" + a + b + c);
        System.out.println("a+b+c = " + (a+b+c));
        System.out.println("------------");

        a += 8;
        System.out.println("a is " + a);
        a -= 4;
        System.out.println("a is " + a);
        System.out.println("-------------");

        //Variable names (Identifiers)
        int oneNumber = 10;
        String spargel = "Pudding";
//        int double = 50;
        //see "forbidden keywords"

        int myNumber = IOTools.readInteger("Geben Sie eine Nummer ein: ");
        System.out.println();
        System.out.println("Ihre Nummer: " + myNumber);

        //Math
        double rand = Math.random();
        System.out.println("Random: " + rand);
        rand = 1+ rand * 10;
        System.out.println("Random *10: " + rand);
        int randomNumber = (int) rand;
        System.out.println("RandomNumber: " + randomNumber);
        double sqrt  = Math.sqrt(randomNumber);
        System.out.println("Sqrt: " + sqrt);
    }
}
