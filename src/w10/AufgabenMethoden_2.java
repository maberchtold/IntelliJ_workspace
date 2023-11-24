package w10;

import java.util.Locale;
import java.util.Scanner;

public class AufgabenMethoden_2 {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        boolean invalideInput = true;
        int selection = 0;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        while (invalideInput) {
            System.out.println("1) addition");
            System.out.println("2) subtraktion");
            System.out.println("3) division");
            System.out.println("4) multiplikation");
            System.out.println("5) ende");
            System.out.print("Wählen Sie:");
            selection = scanner.nextInt();

            switch (selection){
                case 1:
                    addition();
                    break;
                case 2:
                    subtraktion();
                    break;
                case 3:
                    division();
                    break;
                case 4:
                    multiplikation();
                    break;
                case 5:
                    invalideInput = false;
                    break;
            }
        }
    }

    public static void addition(){
        float value1 = 0f;
        float value2 = 0f;
        float result = 0f;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Geben Sie die erste Zahl ein:");
        value1 = scanner.nextFloat();
        System.out.print("Geben Sie die zweite Zahl ein:");
        value2 = scanner.nextFloat();

        result = value1 + value2;

        System.out.println("Das Resultat beträgt: "+result);
    }

    public static void subtraktion(){
        float value1 = 0f;
        float value2 = 0f;
        float result = 0f;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Geben Sie die erste Zahl ein:");
        value1 = scanner.nextFloat();
        System.out.print("Geben Sie die zweite Zahl ein:");
        value2 = scanner.nextFloat();

        result = value1 - value2;

        System.out.println("Das Resultat beträgt: "+result);
    }

    public static void division(){
        float value1 = 0f;
        float value2 = 0f;
        float result = 0f;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Geben Sie die erste Zahl ein:");
        value1 = scanner.nextFloat();
        System.out.print("Geben Sie die zweite Zahl ein:");
        value2 = scanner.nextFloat();

        result = value1 / value2;

        System.out.println("Das Resultat beträgt: "+result);
    }

    public static void multiplikation(){
        float value1 = 0f;
        float value2 = 0f;
        float result = 0f;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Geben Sie die erste Zahl ein:");
        value1 = scanner.nextFloat();
        System.out.print("Geben Sie die zweite Zahl ein:");
        value2 = scanner.nextFloat();

        result = value1 * value2;

        System.out.println("Das Resultat beträgt: "+result);
    }
}
