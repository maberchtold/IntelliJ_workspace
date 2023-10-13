package w04;

import java.util.Scanner;

public class AufgabenSchleifen1_5 {
    public static void main(String[] args) {
        int nr1 = 0;
        int nr2 = 0;
        boolean cancelOperation = false;
        boolean inputNotValid = false;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Geben Sie die erste Zahl ein: ");
            nr1 = scanner.nextInt();

            if (nr1 != -1) {
                System.out.print("Geben Sie die zweite Zahl ein: ");
                nr2 = scanner.nextInt();
                if (nr2 == -1) {
                    cancelOperation = true;
                    break;
                }
            } else {
                cancelOperation = true;
                break;
            }

            if (nr2 < nr1) {
                inputNotValid = true;
                System.out.println("Die zweite Zahl ist kleiner als die erste Zahl!");
            } else {
                inputNotValid = false;
            }

        } while (inputNotValid);

        if (!cancelOperation) {
            do {
                System.out.println(nr1);
                nr1++;
            } while (nr1 <= nr2);
        }
    }
}
