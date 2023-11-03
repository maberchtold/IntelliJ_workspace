package w07;

import java.util.Random;
import java.util.Scanner;

public class Aufgaben1_4 {

    static final int CUP_COUNT = 3;
    static final String CUP_SHAPE = "|_|";

    public static void main(String[] args) {

        char userInput = 'a';
        int randNumber = 0;
        int winCount = 0;
        boolean exitProgram = false;
        boolean invalidUserInput = true;
        boolean cupA = false;
        boolean cupB = false;
        boolean cupC = false;

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        while (!exitProgram){
            randNumber = rand.nextInt(3);

            switch (randNumber) {
                case 0:
                    cupA = true;
                    break;
                case 1:
                    cupB = true;
                    break;
                case 2:
                    cupC = true;
                    break;
            }

            while (invalidUserInput){
                System.out.println(CUP_SHAPE + " " + CUP_SHAPE + " " + CUP_SHAPE + "\n A   B   C");
                System.out.print("Wählen Sie einen Becher (e für beenden): ");
                userInput = scanner.nextLine().charAt(0);
                System.out.println();

                switch (userInput){
                    case 'a':
                    case 'A':
                        if (cupA){
                            System.out.println("Richtig! Wer hätte das gedacht.");
                            System.out.println();
                            winCount++;
                        } else if (cupB) {
                            System.out.println("Hier lag er:");
                            System.out.println(CUP_SHAPE + " " + " * " + " " + CUP_SHAPE + "\n A   B   C");
                            System.out.println("Das stimmt leider nicht - ich habe gewonnen.");
                            System.out.println();
                        }else {
                            System.out.println("Hier lag er:");
                            System.out.println(CUP_SHAPE + " " + CUP_SHAPE + " " + " * " + "\n A   B   C");
                            System.out.println("Das stimmt leider nicht - ich habe gewonnen.");
                            System.out.println();
                        }
                        invalidUserInput = false;
                        break;
                    case 'b':
                    case 'B':
                        if (cupB){
                            System.out.println("Korrekt. aber beim nächsten mal gewinne ich.");
                            System.out.println();
                            winCount++;
                        } else if (cupA) {
                            System.out.println("Hier lag er:");
                            System.out.println(" * " + " " + CUP_SHAPE + " " + CUP_SHAPE + "\n A   B   C");
                            System.out.println("Das stimmt leider nicht - ich habe gewonnen.");
                            System.out.println();
                        }else {
                            System.out.println("Hier lag er:");
                            System.out.println(CUP_SHAPE + " " + CUP_SHAPE + " " + " * " + "\n A   B   C");
                            System.out.println("Das stimmt leider nicht - ich habe gewonnen.");
                            System.out.println();
                        }
                        invalidUserInput = false;
                        break;
                    case 'c':
                    case 'C':
                        if (cupC){
                            System.out.println("Ups - schon wieder richtig");
                            System.out.println();
                            winCount++;
                        } else if (cupB) {
                            System.out.println("Hier lag er:");
                            System.out.println(CUP_SHAPE + " " + " * " + " " + CUP_SHAPE + "\n A   B   C");
                            System.out.println("Das stimmt leider nicht - ich habe gewonnen.");
                            System.out.println();
                        }else {
                            System.out.println("Hier lag er:");
                            System.out.println(" * " + " " + CUP_SHAPE + " " + CUP_SHAPE + "\n A   B   C");
                            System.out.println("Das stimmt leider nicht - ich habe gewonnen.");
                            System.out.println();
                        }
                        invalidUserInput = false;
                        break;
                    case 'e':
                    case 'E':
                        invalidUserInput = false;
                        exitProgram = true;
                        System.out.println("Sie haben " + winCount + " mal richtig getippt.");
                        break;
                    default:
                        System.out.println();
                        System.out.println("Ihre Eingabe war ungültig!");
                        invalidUserInput = true;
                        break;
                }
            }

            invalidUserInput = true;
            cupA = false;
            cupB = false;
            cupC = false;
        }

    }
}
