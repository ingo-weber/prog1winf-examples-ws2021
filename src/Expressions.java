public class Expressions {
    public static void main(String[] args) {
        //One Operand
        int i = -5;
//        int j = +i;
        int j = -i;
        System.out.println("i is " + i + " and j is " + j);
        int a = 5;
        System.out.println("a is " + a);
        a++;
        System.out.println("a is " + a);
        ++a;
        System.out.println("a is " + a);

        //What's the difference?
        System.out.println("What's the difference between ++a and a++?:");
        a = 5;
        System.out.println("a++ is " + a++);
        System.out.println("  a is " + a);
        a = 5;
        System.out.println("++a is " + ++a);
        System.out.println("  a is " + a);

        System.out.println("--------------");
        //Two operands
        int b = 10;
        a = a + b;
        System.out.println("a   is " + a);
        System.out.println("a+b is " + a + b);
        System.out.println("a+b is " + (a+b));

        System.out.println("--------------");
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println("add: " + add);
        System.out.println("sub: " + sub);
        System.out.println("mul: " + mul);
        System.out.println("div: " + div);
        System.out.println("mod: " + mod);
        float divFloat = ((float) a) / ((float) b);
        System.out.println("divFloat: " + divFloat);

        //boolean (true or false)
        System.out.println("--------------");
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        boolean x = a > b;
        System.out.println("x is " + x);
        x = a == b;
        System.out.println("x is " + x);
        x = a != b;
        System.out.println("x is " + x);
    }
}
