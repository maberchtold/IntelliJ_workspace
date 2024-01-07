package w14.aufgabenKlassen2_2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public static void main(String[] args) {
        int menuInput = 0;
        int userInput = 0;
        boolean programRunning = true;
        Maximum maxObj = new Maximum(100);

        while (programRunning){
            System.out.println("1) nr1 setzen");
            System.out.println("2) nr2 setzen");
            System.out.println("3) nr3 setzen");
            System.out.println("4) alle Zahlen ausgeben");
            System.out.println("5) grösste der drei Zahlen anzeigen");
            System.out.println("6) Zahl eingeben und überprüfen ob diese grösser ist als die 3 gepeicherten Werte");
            System.out.println("7) Zahl eingeben und die kleinste Gespeicherte Zahl mit dieser ersetzen");
            System.out.println("8) programm beenden");
            System.out.print("Wählen Sie:");
            menuInput = scanner.nextInt();
            scanner.nextLine();

            switch (menuInput){
                case 1:
                    System.out.print("Geben sie eine Zahl ein:");
                    userInput = scanner.nextInt();
                    scanner.nextLine();
                    maxObj.setNr1(userInput);
                    break;
                case 2:
                    System.out.print("Geben sie eine Zahl ein:");
                    userInput = scanner.nextInt();
                    scanner.nextLine();
                    maxObj.setNr2(userInput);
                    break;
                case 3:
                    System.out.print("Geben sie eine Zahl ein:");
                    userInput = scanner.nextInt();
                    scanner.nextLine();
                    maxObj.setNr3(userInput);
                    break;
                case 4:
                    System.out.println(maxObj.toString());
                    break;
                case 5:
                    System.out.println(maxObj.max_3());
                    break;
                case 6:
                    System.out.print("Geben sie eine Zahl ein:");
                    userInput = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(maxObj.max_1(userInput));
                    break;
                case 7:
                    System.out.print("Geben sie eine Zahl ein:");
                    userInput = scanner.nextInt();
                    scanner.nextLine();
                    maxObj.max_set(userInput);
                    break;
                case 8:
                    programRunning = false;
                    break;
                default:
                    System.out.println("Bitte geben Sie einen gültigen Input ein!");
                    break;
            }
        }
    }
}
