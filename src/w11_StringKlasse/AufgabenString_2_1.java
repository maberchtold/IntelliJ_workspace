package w11_StringKlasse;

import java.util.Scanner;

public class AufgabenString_2_1 {
    public static void main(String[] args) {
        String userInput = "";
        String[] stringArr;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie einen Satz ein: ");
        userInput = scanner.nextLine();

        stringArr = userInput.split(" ");

        System.out.println("Der Satz besteht aus "+stringArr.length+" Wörter.");
    }
}
