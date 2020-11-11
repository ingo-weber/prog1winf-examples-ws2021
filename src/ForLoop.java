import Prog1Tools.IOTools;

public class ForLoop {

    public static void main(String[] args) {
        int[] numbers = {1,5,6,5,5};

        //add +1 to the first element
        numbers[0] = numbers[0]+1;
        //add +1 to the second element
        numbers[1] = numbers[1]+1;
        // ... to much effort

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + ". element before: " + numbers[i]);
            numbers[i] = numbers[i] + 1;
            System.out.println(i + ". element after: " + numbers[i]);
            //i += 2;
        }
        // i exists in the scope of the loop only
        // i = 5; //this assignment is not valid
        System.out.println("------------");

        //this i is a new one
        for (int i = numbers.length-1; i >= 0; --i ){
            System.out.println(i + ". element before: " + numbers[i]);
            numbers[i] = numbers[i] + 10;
            System.out.println(i + ". element after: " + numbers[i]);
            //this will create an endless loop
            //if (i < 1) {
            //    i += 4;
            //}
        }

        System.out.println("------------");
        char[] text = {'a','b','c','d','e'};
        for (int i = 0; i < text.length; i++) {
            System.out.println("i is " + i);
            char c = text[i];
            for (int k = i; k >= 0; k--) {
                System.out.println("k is " + k);
                text[k] = c;
            }
            String result = "";
            for (int j = 0; j < text.length; j++) {
                result += text[j];
            }
            System.out.println("After loop: " + result);
        }
    }

}
