import Prog1Tools.IOTools;


public class Conditions {

    public static void main(String[] args) {
        int i = 5;
        i = IOTools.readInt("Geben Sie eine Zahl ein: ");

        if (i % 2 == 0) {
            System.out.println("Gerade Zahl");

            if (i % 4 == 0) {
                System.out.println("Auch durch 4 teilbar");
            }
        } else {
            System.out.println("Ungerade Zahl");
        }


        System.out.println("-----------------");

        char c = IOTools.readChar("Geben Sie ein Zeichen ein: ");
        if (c == 'a') {
            System.out.println("Ein a");
        } else if (c == 'b'){
            System.out.println("Ein b");
        } else if (c == 'c') {
            System.out.println("Ein c");
        } else {
            System.out.println("Ein anderes Zeichen");
        }

        System.out.println("-----------------");
        System.out.println("Switch-case");

        switch (c) {
            case 'a':
                System.out.println("Ein a ");
                break;
            case 'b':
                System.out.println("Ein b ");
                break;
            case 'c':
                System.out.println("Ein c ");
                break;
            default:
                System.out.println("Ein anderes Zeichen");
        }

    }
}
