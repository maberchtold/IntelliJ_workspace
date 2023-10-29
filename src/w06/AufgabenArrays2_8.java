package w06;

import java.util.Random;
import java.util.Scanner;

public class AufgabenArrays2_8 {
    public static void main(String[] args) {
        //Declare variables
        int[] numbers = new int[0];
        int arraySize = 0;
        int lowerBound = 0;
        int upperBound = 0;
        int randNr = 0;
        int arrayIndex = 0;
        int inputNr = 0;
        char menuInput = 'a';
        boolean arraySizeIsSet = false;
        boolean exitMenu = false;
        boolean errorMessage = false;
        boolean invalideRangeInput = true;
        boolean invalideNumber = true;
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        while(!exitMenu){

            System.out.println("a) Grösse des Arrays angeben");
            System.out.println("b) Zahl an Position ausgeben");
            System.out.println("c) Zahl an Position eingeben");
            System.out.println("d) Alle ausgeben");
            System.out.println("e) Programm beenden");
            System.out.print("Wählen Sie: ");

            menuInput = scanner.nextLine().charAt(0);

            switch (menuInput) {
                case 'a':
                    System.out.print("Geben Sie die gewünschte Zahl an elementen ein: ");
                    arraySize = scanner.nextInt();
                    scanner.nextLine();

                    while (invalideRangeInput){
                        System.out.print("Geben Sie die kleinste Zahl ein mit welcher das Array befüllt werden soll: ");
                        lowerBound = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Geben Sie die grösste Zahl ein mit welcher das Array befüllt werden soll: ");
                        upperBound = scanner.nextInt();
                        scanner.nextLine();

                        if (lowerBound < 0) {
                            System.out.println("Die kleinste Zahl darf nicht kleiner als 0 sein");
                        } else if (lowerBound > upperBound) {
                            System.out.println("Die kleinste Zahl darf nicht grösser als die grösste Zahl sein");
                        } else {
                            invalideRangeInput = false;
                            arraySizeIsSet = true;
                            numbers = new int[arraySize];

                            for (int i = 0; i < numbers.length; i++) {
                                invalideNumber = true;
                                while(invalideNumber){
                                    randNr = rand.nextInt(upperBound + 1);
                                    if (randNr >= lowerBound){
                                        numbers[i] = randNr;
                                        invalideNumber = false;
                                    }
                                }
                            }
                        }

                    }
                    invalideRangeInput = true;
                    break;
                case 'b':
                    if (arraySizeIsSet){
                        System.out.print("Geben sie einen Index des definierten Arrays an: ");
                        arrayIndex = scanner.nextInt();
                        scanner.nextLine();

                        if(arrayIndex < 0 || arrayIndex > numbers.length-1){
                            System.out.println("Der angegeben Index liegt nicht im Bereich des definierten Arrays.");
                        }else {
                            System.out.println(numbers[arrayIndex]);
                        }
                    }else {
                        errorMessage = true;
                    }
                    break;
                case 'c':
                    if (arraySizeIsSet){
                        System.out.print("Geben sie einen Index des definierten Arrays an: ");
                        arrayIndex = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Geben Sie die Zahl ein welche Sie bei diesem Index speichern wollen: ");
                        inputNr = scanner.nextInt();
                        scanner.nextLine();

                        if(arrayIndex < 0 || arrayIndex > numbers.length-1){
                            System.out.println("Der angegeben Index liegt nicht im Bereich des definierten Arrays.");
                        }else {
                            numbers[arrayIndex] = inputNr;
                            System.out.println("Sout die Zahl "+inputNr+" wurde beim Index "+arrayIndex+" gespeichert");
                        }
                    }else {
                        errorMessage = true;
                    }
                    break;
                case 'd':
                    if (arraySizeIsSet){
                        System.out.println("=============================");
                        System.out.println("Ausgabe Array");
                        System.out.println("=============================");
                        for (int i = 0; i < numbers.length; i++) {
                            System.out.println(numbers[i]);
                        }
                        System.out.println("=============================");
                    }else {
                        errorMessage = true;
                    }
                    break;
                case 'e':
                    exitMenu = true;
                    break;
            }

            if (errorMessage){
                System.out.println("Die grösse des Arrays wurde noch nicht bestimmt!");
                errorMessage = false;
            }
        }
    }
}
