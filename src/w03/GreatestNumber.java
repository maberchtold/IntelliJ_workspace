package w03;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3){
            System.out.println(number1 + " is the greatest number");
        }
        if (number2 > number1 && number2 > number3){
            System.out.println(number2 + " is the greatest number");
        }
        if (number3 > number1 && number3 > number2){
            System.out.println(number3 + " is the greatest number");
        }
    }
}
