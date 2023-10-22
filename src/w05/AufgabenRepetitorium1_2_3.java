package w05;

import java.util.Scanner;

public class AufgabenRepetitorium1_2_3 {
    public static void main(String[] args) {
        int maxNumber = 9;
        int numberCounter = 0;
        int amountOfSpaces= maxNumber - 1;
        int spaceCounter =0;
        String outputString = "";

        for(int i=9; i>0; i--){

            numberCounter = maxNumber;

            while (numberCounter >= i){
                outputString = numberCounter + outputString;
                numberCounter--;
            }

            spaceCounter = amountOfSpaces;
            while(spaceCounter > 0){
                outputString = " " + outputString;
                spaceCounter--;
            }

            amountOfSpaces--;

            System.out.println(outputString);

            outputString = "";
        }
    }
}
