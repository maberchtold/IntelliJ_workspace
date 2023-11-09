package w07;

import java.util.Scanner;

public class Aufgaben2_2 {
    public static void main(String[] args) {
        //Aufgabe Backstube
        int mengeMehl = 0;
        int mengeEier = 0;
        int mengeZucker = 0;
        int mengeBackpulver = 0;
        int backtemperatur = 0;
        int backzeit = 0;

        int inputMehl = 0;
        int inputEier = 0;
        int inputZucker = 0;
        int inputBackpulver = 0;

        boolean exitMenu = false;
        boolean needToStir = false;
        char menuSelect = 'a';

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die benötigte Menge an Mehl in gramm ein: ");
        mengeMehl = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Geben Sie die benötigte Menge an Eier ein: ");
        mengeEier = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Geben Sie die benötigte Menge an Zucker in gramm ein: ");
        mengeZucker = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Geben Sie die benötigte Menge an Backpulver in gramm ein: ");
        mengeBackpulver = scanner.nextInt();
        scanner.nextLine();

        do {
            System.out.println("a) Mehl hinzufügen");
            System.out.println("b) Eier hinzufügen");
            System.out.println("c) Zucker hinzufügen");
            System.out.println("d) Backpulver ergänzen");
            System.out.println("e) Umrühren");
            System.out.println("f) Backen");
            System.out.println("g) Glasieren und Servieren");
            System.out.print("Wählen Sie: ");
            menuSelect = scanner.nextLine().charAt(0);

            switch (menuSelect) {
                case 'a':
                case 'A':
                    System.out.print("Wie viel Mehl möchten Sie hinzufügen (in gramm): ");
                    inputMehl = scanner.nextInt();
                    break;
                case 'b':
                case 'B':
                    break;
                case 'c':
                case 'C':
                    break;
                case 'd':
                case 'D':
                    break;
                case 'e':
                case 'E':
                    break;
                case 'f':
                case 'F':
                    break;
                case 'g':
                case 'G':
                    break;
                default:
                    System.out.println("Wählen Sie eine gültige option aus!");
                    exitMenu = false;
                    break;
            }
        } while (!exitMenu);
    }
}
