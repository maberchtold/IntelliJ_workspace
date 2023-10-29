package w06;

import java.util.Scanner;

public class AufgabenArrays2_6 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        int startingNumber = 0;
        int steps = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie einen start wert ein: ");
        startingNumber = scanner.nextInt();

        System.out.print("Geben Sie die Schrittzahl ein: ");
        steps = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = startingNumber;

            startingNumber = startingNumber + steps;
        }

        for (int number: numbers){
            System.out.println(number);
        }
    }
}
