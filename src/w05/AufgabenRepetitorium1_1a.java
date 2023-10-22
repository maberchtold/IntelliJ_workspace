package w05;

import java.util.Scanner;

public class AufgabenRepetitorium1_1a {
    public static void main(String[] args) {
        int numberInput = 0;
        int steps = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie eine Startzahl ein: ");
        numberInput = scanner.nextInt();

        System.out.print("Geben sie die Schrittgrösse ein: ");
        steps = scanner.nextInt();

        while (numberInput >= 0){
            System.out.println(numberInput);
            numberInput = numberInput - steps;
        }
    }
}
