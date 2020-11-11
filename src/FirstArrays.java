public class FirstArrays {

    public static void main(String[] args) {

        boolean seat1 = false;
        boolean seat2 = true;
        boolean seat3 = false;
        //...
        boolean seat255 = false;
        //... to much effort


        boolean[] seats = new boolean[255];
        System.out.println("Seat 5: " + seats[5]);
        System.out.println("Seat 125: " + seats[125]);
        seats[125] = true;
        System.out.println("Seat 125: " + seats[125]);

//        System.out.println("Seat 255 " + seats[255]);
        System.out.println("Seat 254: " + seats[254]);
        System.out.println("Seat 0: " + seats[0]);

        //Address of seats array
        System.out.println("Seats: " + seats);
//
//        int[] randomNumbers = new int[20000];
        //...
    }
}
