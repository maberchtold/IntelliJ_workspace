package w03;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int pBirnen;
        int pKartoffeln;
        int pTomaten;
        int money;

        int amountOfBirnen;
        int amountOfKartoffeln;
        int amountOfTomaten;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Preis Birnen: ");
        pBirnen = scanner.nextInt();

        System.out.print("Preis Kartoffeln: ");
        pKartoffeln = scanner.nextInt();

        System.out.print("Preis Tomaten: ");
        pTomaten = scanner.nextInt();

        System.out.print("Wie viel geld hast du dabei?: ");
        money = scanner.nextInt();

        amountOfBirnen = money / pBirnen;
        amountOfKartoffeln = money / pKartoffeln;
        amountOfTomaten = money / pTomaten;

        System.out.println("Sie können mit dem geld " + amountOfBirnen + " Birnen kaufen.");
        System.out.println("Sie können mit dem geld " + amountOfKartoffeln + " Kartoffeln kaufen.");
        System.out.println("Sie können mit dem geld " + amountOfTomaten + " Tomaten kaufen.");

        System.out.println("Geben sie ein wie viele");


    }
}
