public class Types {
    public static void main(String[] args) {
        //boolean (true or false, 1 Bit)
        boolean b = true;
        System.out.println("b is " + b);
        b = false;
        System.out.println("b is " + b);

        //byte (-128 to 127,  Bits)
        byte by = 10;
        // by = 5000;
        System.out.println("by is " + by);
        //short (about -32k to 32k, 16 Bits)
        short s = -20000;
        s = 15000;
        System.out.println("s is " + s);
        //char(acter) (16 Bits)
        char c = 'H';
        c = 'a';
        System.out.println("c is " + c);
//        c = '\u2620';
//        c = '\u2603';
//        c = '\u2278';
        c = '\u3020';
        System.out.println("c is " + c);

        //int(eger) (about -2 billion to 2 billion, 32 Bits)
        int i = 50000000;
        i = 5;
        //long (64 Bits)
        long l = 456123;
        //float(ing point) (32 Bit)
        float f = 1.23f;
        //double (64 Bit)
        double d = 5.678;

        //Typecasts, implicit
        i = s;
        System.out.println("i is " + i);
        l = i;
        f = l;
        d = f;
        System.out.println("d is " + d);

        //Typecasts, explicit
        f = (float) d;
        l = (long) f;
        s = (short) l;
        System.out.println("s is " + s);
        by = (byte) s;
        System.out.println("by is " + by);
    }
}
