package w11_StringKlasse;

import java.util.Scanner;

public class AufgabenString_2_2 {
    public static void main(String[] args) {
        String[] wordArr = new String[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < wordArr.length; i++) {
            System.out.print("Geben Sie das "+(i+1)+". Wort ein: ");
            wordArr[i] = scanner.nextLine();
        }

        for (int i = 0; i < wordArr.length; i++) {
            if (hasDoubleConsonant(wordArr[i])){
                System.out.println(wordArr[i]);
            }
        }
    }

    public static boolean hasDoubleConsonant(String word){
        boolean doubleConsonant = false;

        word = word.toLowerCase();

        for (int i = 0; i < word.length() - 1; i++){
            if (word.charAt(i) == word.charAt(i+1)){
                doubleConsonant = true;
            }
        }

        return doubleConsonant;
    }
}
