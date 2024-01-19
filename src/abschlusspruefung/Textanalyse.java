package abschlusspruefung;

import java.util.Locale;
import java.util.Scanner;

public class Textanalyse {
    public static void main(String[] args) {
        /*
        //a)
        System.out.println(containsSingleNumLetters("This is a test", 't'));

        //b)
        char[] charArr = {'a','t','e'};
        System.out.println(containsMultipleNumLetters("This is a test", charArr));

        //c)
        System.out.println(containsMinLetter("This is a test", 't', 2));

        //d)
        System.out.println(plainText("This is a test"));

         */

        String text = "";
        char character = 'a';
        char[] charArr;
        int charArrSize = 0;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Geben Sie einen Text ein: ");
        text = scanner.nextLine();
        System.out.print("Geben Sie einen character ein: ");
        character = scanner.nextLine().charAt(0);
        System.out.print("Geben Sie ein wie viele character sie eingeben möchten: ");
        charArrSize = scanner.nextInt();
        scanner.nextLine();
        charArr = new char[charArrSize];
        for (int i = 0; i < charArr.length; i++){
            System.out.print("Geben sie den "+(i+1)+". character ein: ");
            charArr[i] = scanner.nextLine().charAt(0);
        }

        //a)
        System.out.println("Der Text enthält "+containsSingleNumLetters(text, character)+ " mal den character "+character);

        //b)
        System.out.println("Der Text enthält "+containsMultipleNumLetters(text, charArr)+" mal die eingegebenen Buchstaben");

        //c)
        System.out.println(containsMinLetter("This is a test", 't', 2));

        //d)
        System.out.println("'"+text+"' in plain text ist "+plainText(text));
    }

    public static int containsSingleNumLetters(String str, char chr){
        int counter = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == chr){
                counter++;
            }
        }

        return counter;
    }

    public static int containsMultipleNumLetters(String str, char[] charArr){
        int counter = 0;
        for (int i = 0; i < charArr.length; i++){
            counter += containsSingleNumLetters(str, charArr[i]);
        }
        return counter;
    }

    public static boolean containsMinLetter(String str, char chr, int minNr){
        boolean retBool = false;
        int nr = 0;
        nr = containsSingleNumLetters(str, chr);

        if (nr >= minNr){
            retBool = true;
        }
        return retBool;
    }

    public static String plainText(String str){
        str = str.replace(" ", "");
        str = str.replace(".", "");
        str = str.replace("?", "");
        str = str.replace("'", "");
        str = str.replace(",", "");
        str = str.toLowerCase();
        return str;
    }
}
