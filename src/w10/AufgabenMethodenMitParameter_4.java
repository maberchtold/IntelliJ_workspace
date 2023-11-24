package w10;

import java.util.Scanner;

public class AufgabenMethodenMitParameter_4 {
    public static void main(String[] args) {
        start();
    }

    public static void start(){
        String[] words;
        int arrSize = 0;
        String userInput;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie an wie viele Wörter Sie eingeben möchten: ");
        arrSize = scanner.nextInt();
        scanner.nextLine();

        words = new String[arrSize];
        System.out.print("Geben Sie ihren Satz ein: ");
        for (int i = 0; i < words.length; i++){
            userInput = scanner.next();
            if (userInput.charAt(0) == '.'){
                break;
            }
            words[i] = userInput;
        }

        vor(words);
    }

    public static void vor(String[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        anzahl(arr);
    }

    public static void anzahl(String[] arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != null){
                counter++;
            }
        }
        System.out.println("Sie haben "+counter+" Wörter eingegeben.");

        zurueck(arr);
    }

    public static void zurueck(String[] arr){
        for (int i = arr.length - 1 ; i >= 0 ; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
