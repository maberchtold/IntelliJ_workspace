package w06;

import java.util.Scanner;

public class AufgabenArrays2_7 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        int startingNumber = 0;
        int factor = 0;
        int multiplier = 0;
        int inputNumber = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie einen start wert ein: ");
        inputNumber = scanner.nextInt();

        System.out.print("Geben Sie die Schrittzahl ein: ");
        factor = scanner.nextInt();

        multiplier = inputNumber * factor;
        startingNumber = multiplier;
        numbers[0] = startingNumber;
        for (int i = 1; i < numbers.length; i++){

            numbers[i] = numbers[i-1] + inputNumber;

        }

        for (int number: numbers){
            System.out.println(number);
        }
    }
}
