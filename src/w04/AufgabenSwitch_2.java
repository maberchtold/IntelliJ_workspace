package w04;

import java.util.Scanner;

public class AufgabenSwitch_2 {
    public static void main(String[] args) {
        int month = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben sie den gewünschten Monat ein: ");
        month = scanner.nextInt();

        switch (month){
            case 1:
                System.out.println("Der Januar hat 31 tage.");
                break;
            case 2:
                System.out.println("Der Februar hat 28 tage.");
                break;
            case 3:
                System.out.println("Der März hat 31 tage.");
                break;
            case 4:
                System.out.println("Der April hat 30 tage.");
                break;
            case 5:
                System.out.println("Der Mai hat 31 tage.");
                break;
            case 6:
                System.out.println("Der Juni hat 30 tage.");
                break;
            case 7:
                System.out.println("Der Juli hat 31 tage.");
                break;
            case 8:
                System.out.println("Der August hat 31 tage.");
                break;
            case 9:
                System.out.println("Der September hat 30 tage.");
                break;
            case 10:
                System.out.println("Der Oktober hat 31 tage.");
                break;
            case 11:
                System.out.println("Der November hat 30 tage.");
                break;
            case 12:
                System.out.println("Der Dezember hat 31 tage.");
                break;
        }

    }
}
