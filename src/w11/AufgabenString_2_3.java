package w11;

import java.util.Scanner;

public class AufgabenString_2_3 {
    public static void main(String[] args) {
        String[] worte;

        worte = eingabe(5);
        ausgabe(worte);
        anzZeichen(worte);
        beginsWith(worte, 'm');
        findLetter(worte, 'a');
    }

    public static String[] eingabe(int anzahl){
        String[] retArr = new String[anzahl];
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        for (int i = 0; i < retArr.length; i++){
            System.out.print("Geben Sie den "+(i+1)+". Namen ein: ");
            userInput = scanner.nextLine();
            if (checkIfNameAlreadyExists(retArr, userInput)){
                System.out.println("Der wurde bereits eingegeben!");
                i--;
            }else{
                retArr[i] = upperCase(userInput);
            }
        }
        return retArr;
    }

    public static void ausgabe(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static boolean checkIfNameAlreadyExists(String[] arr, String input){
        boolean alreadyExists = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].equalsIgnoreCase(input)){
                alreadyExists = true;
            }
        }
        return alreadyExists;
    }

    public static String upperCase(String str){
        str = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
        return str;
    }

    public static void anzZeichen(String[] arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            counter += arr[i].length();
        }

        System.out.println("Das Array enthält "+counter+" Zeichen.");
    }

    public static void beginsWith(String[] arr, char search){
        System.out.println("Die folgenden Namen beginnen mit dem Buchstaben: "+search);
        for (int i = 0; i < arr.length; i++){
            if (arr[i].toLowerCase().charAt(0) == search){
                System.out.println(arr[i]);
            }
        }
    }

    public static void findLetter(String[] arr, char letter){
        int globalCounter = 0;
        System.out.println("Tabelle welche zeigt wie viele male der Buchstabe "+letter+" in jedem Namen auftritt:");

        for (int i = 0; i < arr.length; i++){
            String tempStr = arr[i].toLowerCase();
            int counter = 0;
            for (int j = 0; j < tempStr.length(); j++){
                if (tempStr.charAt(j) == letter){
                    counter++;
                    globalCounter++;
                }
            }
            System.out.println(arr[i]+" -> "+counter);
        }
        System.out.println("Gesamt -> "+globalCounter);
    }
}
