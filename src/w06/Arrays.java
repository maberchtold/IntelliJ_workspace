package w06;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        int[] numberCount = new int[100];
        int duplicateNumbers = 0;
        int steps = 0;
        int lowerBound = 0;
        int upperBound = 0;
        int sum = 0;
        boolean invalidInput = true;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        for (int i : numbers){
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = numbers.length - 1 ; i >= 0; i--){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        System.out.print("Geben sie die ein in welchen Schritten die Zahlen ausgegeben werden sollen: ");
        steps = scanner.nextInt();

        for (int i = -1 + steps; i < numbers.length; i = i +steps){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

        while (invalidInput){
            System.out.print("Geben Sie die untere grenze ein: ");
            lowerBound = scanner.nextInt();
            System.out.print("Geben Sie die obere grenze ein: ");
            upperBound = scanner.nextInt();

            if(lowerBound < 0){
                System.out.println("Die untere grenze darf nicht kleiner als 0 sein.");
            } else if (lowerBound > upperBound) {
                System.out.println("Die untere grenze darf nicht grösser sein als die obere grenze.");
            } else if (upperBound > numbers.length - 1) {
                System.out.println("Der angegebene index existiert nicht.");
            }else{
                invalidInput = false;
            }
        }

        for (int i = lowerBound ; i <= upperBound; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

        for (int i : numbers){
            sum = sum + i;
        }
        System.out.print("Die Summe aller zahlen beträgt: "+sum);
        System.out.println();


        //count Numbers in array
        for (int i=0; i <numberCount.length;i++){
            for (int j = 0; j<numbers.length ; j++){
                if (i == numbers[j]){
                    duplicateNumbers++;
                }
            }
            numberCount[i] = duplicateNumbers;
            duplicateNumbers = 0;
        }

        //print duplicate number array
        for (int i = 0; i < numberCount.length; i++){
            System.out.println(i + ": " + numberCount[i]);
        }
    }
}
