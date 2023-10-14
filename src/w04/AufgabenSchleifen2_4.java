package w04;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class AufgabenSchleifen2_4 {
    public static void main(String[] args) {
        int randomNumber = 0;
        int maxNumber = 100;
        int numberInput;

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        randomNumber = rand.nextInt(maxNumber);

        do {
            System.out.print("Erraten Sie die Zufallszahl: ");
            numberInput = scanner.nextInt();

            if (numberInput < randomNumber){
                System.out.println("Die Zufallszahl ist grösser");
            } else if (numberInput > randomNumber) {
                System.out.println("Die Zufallszahl ist kleiner");
            }else {
                System.out.println("Sie haben die Zahl richtig erraten!");
            }
        } while (randomNumber != numberInput);
    }
}
