public class ArrayAdvanced {

    public static void main(String[] args) {
        //Length
        int[] numbers = {2,5,3,4};
        System.out.println("Es gibt " + numbers.length + " Elemente im Arrray");
        System.out.println("Das erste Element ist " + numbers[0]);
        System.out.println("Das letzte Element ist " + numbers[numbers.length-1]);
        System.out.println("-----------------");

        //Multi-dimensional
        boolean[][] seats = new boolean[30][20];
        seats[2][10] = true;
        System.out.println("Seat (2,10): " + seats[2][10]);
        //seats[31][10] = true;

        System.out.println("Multidim. length: " + seats.length);
        System.out.println("Multidim. length, 2nd dimension: " + seats[0].length);
        System.out.println("-----------------");

        //Multi-dim with variable length
        seats[2] = new boolean[5];
        System.out.println("Multidim. length: " + seats.length);
        System.out.println("Multidim. length, 2nd dimension: " + seats[0].length);
        System.out.println("Multidim. length, 2nd dimension: " + seats[2].length);
        System.out.println("-----------------");

        //Default values
        boolean[] b = new boolean[1];
        System.out.println("b is " + b[0]);

        int[] i = new int[1];
        System.out.println("i is " + i[0]);

        char[] c = new char[1];
        System.out.println("c is " + c[0]);

        String[] s = new String[1];
        System.out.println("s is " + s[0]);
    }
}
