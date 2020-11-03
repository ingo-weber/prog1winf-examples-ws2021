public class BooleanOperators {

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        boolean c = true;
        boolean d = false;

        //AND: All must be true
        boolean and = c & d;
        System.out.println("and is " + and);
        and = c & (b % a == 0);
        System.out.println("and is " + and);

        //OR: At least ONE must be true
        System.out.println("-------------");
        boolean or = c | d;
        System.out.println("or is " + or);
        or = c | (b % a == 0);
        System.out.println("or is " + or);

        //XOR: Exactly ONE must be true
        System.out.println("-------------");
        boolean xor = c ^ d;
        System.out.println("xor is " + xor);
        xor = c ^ (b % a == 0);
        System.out.println("xor is " + xor);

        //NOT: switches true <-> false
        System.out.println("-------------");
        boolean not = true;
        System.out.println("not is " + not);
        not = !not;
        System.out.println("not is " + not);
        not = !not;
        System.out.println("not is " + not);

        System.out.println("-------------");
        System.out.println("Difference between & and &&:");

        int i = 5;
        boolean x = (true & (i = 10) == 10);
        System.out.println("x is " + x + " i, is " + i);

        i = 5;
        x = (false & (i = 10) == 10);
        System.out.println("x is " + x + " i, is " + i);

        i = 5;
        x = (false && (i = 10) == 10);
        System.out.println("x is " + x + " i, is " + i);
    }
}
