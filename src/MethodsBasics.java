public class MethodsBasics {
    public static void main(String[] args) {
        if (args.length >= 1) {
            System.out.println("Dieses Programm akzeptiert keine Parametereingabe");
            System.out.println("Erster eingegebener Paramter: " + args[0]);
            return;
        }
        int[] myArray = {1, 2, 3, 4, 5};
        int[] myArray2 = {6, 7, 8, 9, 10};
        int[] myArray3;
        printArray(myArray);
        System.out.println("The end of the first array");
        printArray(myArray2);
//        printArray(myArray3);
        System.out.println("The end");

        int [] array = {1,2};
        System.out.println("[" + array[0] + "," + array[1] + "]");
        changeArray(array);
        System.out.println("[" + array[0] + "," + array[1] + "]");
    }

    private static void changeArray(int[] array1) {
        // changes the value of an array cell referred to by the parameter -> effect outside and inside the method
        array1[0] = 8;
        System.out.println("[" + array1[0] + "," + array1[1] + "]");
        // creates a new array -> no effect on the outside, but effect inside the method
        array1 = new int[2];
        System.out.println("[" + array1[0] + "," + array1[1] + "]");
    }

    public static void printArray(int[] array) {
        if (array == null){
            return;
        }
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void printArray(double[] array) {
        if (array == null){
            return;
        }
        for (double d : array) {
            System.out.println(d);
        }
    }
}
