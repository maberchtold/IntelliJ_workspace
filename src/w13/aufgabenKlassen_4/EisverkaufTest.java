package w13.aufgabenKlassen_4;

import java.util.Locale;
import java.util.Scanner;

public class EisverkaufTest {
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public static void main(String[] args) {
        int userInput = 0;
        int userInputSubMenu = 0;
        boolean programIsRunning = true;
        boolean subMenuIsRunning = true;
        boolean orderNotPayed = false;
        String sorte = "";

        while(programIsRunning){
            System.out.println("1) Bestellung starten");
            System.out.println("2) Programm beenden");
            System.out.print("Wählen Sie: ");
            userInput = scanner.nextInt();
            scanner.nextLine();

            switch (userInput) {
                case 1:

                    Eisverkauf bestellung = new Eisverkauf(5.5);

                    while (subMenuIsRunning){
                        System.out.println("1) Sorte bestellen");
                        System.out.println("2) bezahlen");
                        System.out.println("3) zurück");
                        System.out.print("Wählen Sie: ");
                        userInputSubMenu = scanner.nextInt();
                        scanner.nextLine();

                        switch (userInputSubMenu) {
                            case 1:
                                System.out.print("Geben Sie die gewünschte Sorte ein: ");
                                sorte = scanner.nextLine();
                                bestellung.bestellen(sorte);
                                orderNotPayed = true;
                                break;
                            case 2:
                                System.out.println(bestellung.zahlen());
                                orderNotPayed = false;
                                break;
                            case 3:
                                if (orderNotPayed){
                                    subMenuIsRunning = true;
                                    System.out.println("Sie müssen zuerst die Bestellung bezahlen");
                                }else{
                                    subMenuIsRunning = false;
                                }
                                break;
                            default:
                                System.out.println("Wählen Sie einen gültigen menupunkt aus");
                                break;
                        }
                    }
                    subMenuIsRunning = true;
                    break;
                case 2:
                    programIsRunning = false;
                    break;
                default:
                    System.out.println("Wählen Sie einen gültigen menupunkt aus");
                    break;
            }
        }
    }
}
