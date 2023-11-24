package w10;

import java.util.Scanner;

public class AufgabenMethodenMitRueckgabewert_2 {
    public static void main(String[] args) {
        String date = "";
        Scanner scanner = new Scanner(System.in);
        boolean dateIsValid = false;

        while (true){
            System.out.print("Geben Sie ein Datum im Format TTMMJJJJ ein: ");
            date = scanner.nextLine();
            dateIsValid = datumPruefen(date);
            if (dateIsValid){
                System.out.println("Das eingegebene Datum ist gültig.");
            }else {
                System.out.println("Das eingegebene Datum ist nicht gültig.");
            }
        }

    }

    public static boolean datumPruefen(String date){
        boolean dateIsValid = true;
        int dateInt = 0;
        int day = 0;
        int month = 0;
        int year = 0;

        //check if date contains 8 numbers
        if (date.length() != 8){
            dateIsValid = false;
        }

        dateInt = Integer.parseInt(date);

        day = dateInt / 1000000;
        month = (dateInt / 10000)%100;
        year = dateInt % 10000;

        if (day <= 0 || month <= 0 || year < 1700 || month > 12){
            dateIsValid = false;
        }

        if (month == 1 && day > 31){
            dateIsValid = false;
        }

        if (month == 2 && day > 28){
            dateIsValid = false;
        }

        if (month == 3 && day > 31){
            dateIsValid = false;
        }

        if (month == 4 && day > 30){
            dateIsValid = false;
        }

        if (month == 5 && day > 31){
            dateIsValid = false;
        }

        if (month == 6 && day > 30){
            dateIsValid = false;
        }

        if (month == 7 && day > 31){
            dateIsValid = false;
        }

        if (month == 8 && day > 31){
            dateIsValid = false;
        }

        if (month == 9 && day > 30){
            dateIsValid = false;
        }

        if (month == 10 && day > 31){
            dateIsValid = false;
        }

        if (month == 11 && day > 30){
            dateIsValid = false;
        }

        if (month == 12 && day > 31){
            dateIsValid = false;
        }

        return dateIsValid;
    }
}
