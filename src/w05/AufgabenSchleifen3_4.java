package w05;

import java.util.Scanner;

public class AufgabenSchleifen3_4 {
    public static void main(String[] args) {
        int numberCount = 0;
        int numberInput = 0;
        int numberSum = 0;
        int singleDigitNumbers = 0;
        int doubleDigitNumbers = 0;
        int tripleDigitNumbers = 0;
        int moreDigitNumbers = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie viele Zahlen möchten Sie eingeben?: ");
        numberCount = scanner.nextInt();

        for (int i = 0; i < numberCount; i++) {
            System.out.print("Geben Sie die "+(i+1)+". Zahl ein: ");
            numberInput = scanner.nextInt();

            numberSum = numberSum + numberInput;

            int length = String.valueOf(numberInput).length();

            switch (length) {
                case 1:
                    singleDigitNumbers++;
                    break;
                case 2:
                    doubleDigitNumbers++;
                    break;
                case 3:
                    tripleDigitNumbers++;
                    break;
                default:
                    moreDigitNumbers++;
            }
        }

        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Die Summe aller Zahlen beträgt "+numberSum);
        System.out.println("Es wurden "+singleDigitNumbers+" einstellige Nummern eingegeben");
        System.out.println("Es wurden "+doubleDigitNumbers+" zweistellige Nummern eingegeben");
        System.out.println("Es wurden "+tripleDigitNumbers+" dreistellige Nummern eingegeben");
        System.out.println("Es wurden "+moreDigitNumbers+" mehr als dreistellige Nummern eingegeben");
    }
}
