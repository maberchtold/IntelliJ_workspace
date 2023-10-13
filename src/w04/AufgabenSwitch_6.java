package w04;

import java.util.Scanner;

public class AufgabenSwitch_6 {
    public static void main(String[] args) {
        char inputChar = 'a';
        boolean isVocal = false;
        boolean isUmlaut = false;
        boolean isConsonant = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie einen Buchstaben ein: ");
        inputChar = scanner.nextLine().toLowerCase().charAt(0);

        switch (inputChar) {
            case 'a':
                isVocal = true;
                break;
            case 'e':
                isVocal = true;
                break;
            case 'i':
                isVocal = true;
                break;
            case 'o':
                isVocal = true;
                break;
            case 'u':
                isVocal = true;
                break;
            case 'ä':
                isUmlaut = true;
                break;
            case 'ö':
                isUmlaut = true;
                break;
            case 'ü':
                isUmlaut = true;
                break;
            case 'b':
                isConsonant = true;
                break;
            case 'c':
                isConsonant = true;
                break;
            case 'd':
                isConsonant = true;
                break;
            case 'f':
                isConsonant = true;
                break;
            case 'g':
                isConsonant = true;
                break;
            case 'h':
                isConsonant = true;
                break;
            case 'j':
                isConsonant = true;
                break;
            case 'k':
                isConsonant = true;
                break;
            case 'l':
                isConsonant = true;
                break;
            case 'm':
                isConsonant = true;
                break;
            case 'n':
                isConsonant = true;
                break;
            case 'p':
                isConsonant = true;
                break;
            case 'q':
                isConsonant = true;
                break;
            case 'r':
                isConsonant = true;
                break;
            case 's':
                isConsonant = true;
                break;
            case 't':
                isConsonant = true;
                break;
            case 'v':
                isConsonant = true;
                break;
            case 'w':
                isConsonant = true;
                break;
            case 'x':
                isConsonant = true;
                break;
            case 'y':
                isConsonant = true;
                break;
            case 'z':
                isConsonant = true;
                break;
        }

        if (isVocal) {
            System.out.println(inputChar + " ist ein Vokal");
        } else if (isUmlaut) {
            System.out.println(inputChar + " ist ein Umalut");
        } else if (isConsonant) {
            System.out.println(inputChar + " ist ein Konsonant");
        } else {
            System.out.println(inputChar + " ist kein Buchstabe welcher in der deutschen Sprache verwendet wird");
        }
    }
}
