package examPractice;

import w14.aufgabenKlassen2_3.Array;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class EindimensionaleArrays1 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int userInput = 0;
        int startRange = 0;
        int endRange = 0;
        int sum = 0;
        int indexSelection = 0;
        int biggestNumber = 0;
        int smallestNumber = 0;
        int average = 0;
        int tmpNr = 0;
        boolean invalidInput = true;
        int[] countArr = new int[100];
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Random rand = new Random();

        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(100);
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        /*
        //Jeden nten wert ausgeben
        System.out.print("Jeden n-ten wert ausgeben:");
        userInput = scanner.nextInt();
        for (int i = userInput-1; i < arr.length; i = i + userInput){

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //von bis ausgeben
        System.out.print("startRange: ");
        startRange = scanner.nextInt();
        System.out.print("endRange: ");
        endRange = scanner.nextInt();

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > startRange && arr[i] < endRange){
                System.out.print(arr[i] + " ");
            }
        }
        */
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Die Summe aller Zahlen beträgt: "+sum);
        /*

        while (invalidInput){
            System.out.print("Geben Sie einen Index ein: ");
            indexSelection = scanner.nextInt();
            if (indexSelection >= 0 && indexSelection < arr.length){
                invalidInput = false;
                System.out.println("Value by Index: "+ arr[indexSelection]);
            }else{
                invalidInput = true;
                System.out.println("Invalid input!");
            }
        }


        for (int i = 0; i < arr.length; i++){
            if (arr[i] > biggestNumber){
                biggestNumber = arr[i];
            }
        }
        System.out.println("Biggest number: " + biggestNumber);
        */

        for (int i = 0; i < arr.length; i++){
            countArr[arr[i]] += 1;
        }

        for (int i = 0; i < countArr.length; i++){
            System.out.println(i+ ": " +countArr[i]);
        }

        average = sum / 100;
        System.out.println("The average is:"+ average);

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < smallestNumber){
                smallestNumber = arr[i];
            }
        }

        System.out.println("Die kleinste Zahl kommt "+countArr[smallestNumber]+" mal vor");

        tmpNr = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = tmpNr;

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
