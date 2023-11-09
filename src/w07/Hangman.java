package w07;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String geheimwort = "";
        char [] gesucht;
        char [] geraten;
        char userInput = 'a';
        boolean correctChar = false;
        int fehler = 0;
        int correctCharCount = 0;

        boolean wortErraten = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie das Geheimwort ein: ");
        geheimwort = scanner.nextLine();

        gesucht = new char [geheimwort.length()];
        geraten = new char [geheimwort.length()];

        for (int i = 0; i < geheimwort.length(); i++){
            geraten[i] = '_';
            gesucht[i] = geheimwort.charAt(i);
        }

        do {
            for (int i = 0; i < geraten.length ; i++){
                System.out.print(geraten[i]);
            }
            System.out.println();
            System.out.print("Geben Sie einen Buchstaben ein: ");
            userInput = scanner.nextLine().charAt(0);

            for (int i = 0; i < gesucht.length ; i++){
                if (userInput == gesucht[i]){
                    geraten[i] = userInput;
                    correctChar = true;
                    correctCharCount++;
                }
            }

            if (correctChar){
                System.out.println("Sie haben einen Buchstaben erraten!");
                if(correctCharCount == geheimwort.length()){
                    wortErraten = true;
                }
            }else{
                fehler++;
                System.out.println("Leider falsch. Sie haben " + fehler +" Fehler gemacht.");

                if (fehler == 10){
                    wortErraten = true;
                }
            }
            correctChar = false;

        } while (!wortErraten);

        if(fehler == 10){
            System.out.println("GAME OVER");
        }else {
            System.out.println("Sie haben das Wort " + geheimwort + " erfolgreich erraten.");
        }

        /*
        for (int i = 0; i < gesucht.length ; i++){
            System.out.print(gesucht[i]);
        }

        for (int i = 0; i < geraten.length ; i++){
            System.out.print(geraten[i]);
        }
        */
    }
}
