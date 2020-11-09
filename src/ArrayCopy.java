public class ArrayCopy {

    public static void main(String[] args) {
        int[] i;
        i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        System.out.println("i: [" + i[0] + "," + i[1] + "," + i[2] + "]");

        int[] i2 = i;
        System.out.println("i2: [" + i2[0] + "," + i2[1] + "," + i2[2] + "]");

        System.out.println("------------");
        i[0] = 4;
        System.out.println("i: [" + i[0] + "," + i[1] + "," + i[2] + "]");
        System.out.println("i2: [" + i2[0] + "," + i2[1] + "," + i2[2] + "]");

        System.out.println("------------");
        i = new int[3];
        i[0] = 9;
        System.out.println("i: [" + i[0] + "," + i[1] + "," + i[2] + "]");
        System.out.println("i2: [" + i2[0] + "," + i2[1] + "," + i2[2] + "]");

        System.out.println("------------");
        //Deep Copy
        i[0] = i2[0];
        i[1] = i2[1];
        i[2] = i2[2];

        System.out.println("i: [" + i[0] + "," + i[1] + "," + i[2] + "]");
        System.out.println("i2: [" + i2[0] + "," + i2[1] + "," + i2[2] + "]");

        i[0] = 1;
        System.out.println("i: [" + i[0] + "," + i[1] + "," + i[2] + "]");
        System.out.println("i2: [" + i2[0] + "," + i2[1] + "," + i2[2] + "]");

    }
}
