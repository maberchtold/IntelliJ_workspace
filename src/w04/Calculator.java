package w04;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator = '+';
        float nr1 = 0f;
        float nr2 = 0f;
        float result = 0f;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Geben Sie die erste Zahl ein: ");
        nr1 = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Geben Sie den Operator ein: ");
        operator = scanner.nextLine().charAt(0);

        System.out.print("Geben Sie die zweite Zahl ein: ");
        nr2 = scanner.nextFloat();

        switch (operator) {
            case '+':
                result = nr1 + nr2;
                break;
            case '-':
                result = nr1 - nr2;
                break;
            case '*':
                result = nr1 * nr2;
                break;
            case '/':
                result = nr1 / nr2;
                break;
        }

        System.out.println("Das resultat von "+nr1+" "+operator+" "+ nr2 + " ist " + result );
    }
}
