public class Expressions {
    public static void main(String[] args) {
        //One Operand
        int a = 5;
        System.out.println("a is " + a);
        a++;
        System.out.println("a is " + a);
        ++a;
        System.out.println("a is " + a);

        //What's the difference?
        System.out.println("What's the difference?:");
        System.out.println("a is " + a++);
        System.out.println("a is " + a);
        System.out.println("a is " + ++a);
        System.out.println("a is " + a);

        //Two operands
        int b = 10;
        a = a + b;
        System.out.println("a+b is " + a);
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

        //boolean (true or false)
        System.out.println("--------------");
        boolean x = a > b;
        System.out.println("x is " + x);
        x = a == b;
        System.out.println("x is " + x);
        x = a != b;
        System.out.println("x is " + x);
    }
}
