public class ForEach {



    public static void main(String[] args) {
        int[] numbers = {2,6,4,5,6};
        for (int i : numbers) {
            System.out.println("i is " + i);
            i += 10;
            System.out.println("increased: " + i);
        }

        System.out.println("----------------");

        for (int i : numbers) {
            System.out.println("i is " + i);
        }
    }
}
