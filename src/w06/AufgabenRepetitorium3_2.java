package w06;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class AufgabenRepetitorium3_2 {
    public static void main(String[] args) {
        //Define variables

        //General
        String firstName = "";
        String lastName = "";
        int age = 0;
        char gender = 'm';
        int tel = 0;
        char maritalStatus = 'l';
        int amountChildren = 0;
        int ageOldestChild = 0;
        int ageYoungestChild = 0;

        String preString = "";

        //Adress
        String street = "";
        String streetNr = "";
        int plz = 0;
        String city = "";

        //Bools
        Boolean isChild = false;
        Boolean isKindergardenChild = false;
        Boolean isPrimarySchoolStudent = false;
        Boolean isOsStudent = false;
        Boolean isTeenager = false;
        Boolean isAdult = false;
        Boolean showTelNr = false;

        Boolean bookVoucherPrize = false;
        Boolean ballPrize = false;
        Boolean penPrize = false;
        Boolean newspaperPrize = false;
        Boolean sketchBookPrize = false;
        Boolean pencilPrize = false;
        Boolean showerGelPrize = false;
        Boolean cinemaTicketPrize = false;
        Boolean duploStonePrize = false;
        Boolean baloonPrize = false;
        int baloonPrizeAmount = 0;

        Boolean noPrize = true;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie ihren Vornamen ein: ");
        firstName = scanner.nextLine();

        System.out.print("Geben Sie ihren Nachnamen ein: ");
        lastName = scanner.nextLine();

        System.out.print("Geben Sie ihr alter ein: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Geben Sie ihr Geschlecht ein (m/w): ");
        gender = scanner.nextLine().charAt(0);

        System.out.println("Geben Sie ihre Adresse ein");
        System.out.print("Strasse: ");
        street = scanner.nextLine();
        System.out.print("Hausnummer: ");
        streetNr = scanner.nextLine();
        System.out.print("Postleitzahl: ");
        plz = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ort: ");
        city = scanner.nextLine();

        System.out.print("Geben Sie ihre Telefionnumer ein: ");
        tel = scanner.nextInt();
        scanner.nextLine();

        if(age <= 4){
            isChild = true;
        } else if (age > 4 && age <= 6) {
            isKindergardenChild = true;
        } else if (age > 6 && age <= 12) {
            isPrimarySchoolStudent = true;
        } else if (age > 12 && age <= 15) {
            isOsStudent = true;
        } else if (age > 15 && age <= 17) {
            isTeenager = true;
        } else {
            isAdult = true;
        }

        if(isAdult){
            System.out.print("Geben Sie ihren Familienstand ein (l->ledig, v->verheiratet, g->geschieden, w->verwitwet): ");
            maritalStatus = scanner.nextLine().charAt(0);

            System.out.print("Wie viele Kinder haben Sie: ");
            amountChildren = scanner.nextInt();
            scanner.nextLine();

            if (amountChildren > 0){
                System.out.print("Geben Sie das alter Ihres ältesten Kindes ein: ");
                ageOldestChild = scanner.nextInt();
                scanner.nextLine();

                if (amountChildren > 1){
                    System.out.print("Geben Sie das alter Ihres jüngsten Kindes ein: ");
                    ageYoungestChild = scanner.nextInt();
                    scanner.nextLine();
                }
            }
        }

        if (isAdult && amountChildren >= 1 && ageOldestChild < 18){
            bookVoucherPrize = true;
            noPrize = false;
        }

        if (isAdult && amountChildren == 1 && ageOldestChild <= 4){
            ballPrize = true;
            noPrize = false;
        }

        if (isAdult && amountChildren >= 2 && ageYoungestChild <= 4 && ageOldestChild > 4 && ageOldestChild <= 15){
            penPrize = true;
            noPrize = false;
        }

        if (age > 50 && age < 80){
            newspaperPrize = true;
            noPrize = false;
        }

        if (isKindergardenChild || isPrimarySchoolStudent || isOsStudent){
            sketchBookPrize = true;
            noPrize = false;
        }

        if (isPrimarySchoolStudent || isAdult && maritalStatus == 'l'){
            pencilPrize = true;
            noPrize = false;
        }

        if (isTeenager && gender == 'f' || isAdult && gender == 'm'){
            showerGelPrize = true;
            noPrize = false;
        }

        if (isAdult && ageOldestChild < 18 && ageOldestChild >= 16 && ageYoungestChild >= 7 && ageYoungestChild <= 12){
            cinemaTicketPrize = true;
            noPrize = false;
        }

        if (isAdult && ageOldestChild <= 4 && amountChildren >= 1){
            duploStonePrize = true;
            noPrize = false;
        }

        if (isAdult && amountChildren >= 4){
            baloonPrize = true;
            baloonPrizeAmount = amountChildren;
            noPrize = false;
        }

        if (isAdult && gender == 'm') {
            preString = "Herr";
        } else if (isAdult && gender == 'f') {
            preString = "Frau";
        } else{
            preString = "An";
        }

        if(isAdult && maritalStatus == 'l' || isAdult && maritalStatus == 'w'){
            showTelNr = true;
        }

        System.out.println("==============================");
        System.out.println(preString + " " + firstName + " " + lastName);
        System.out.println(street + " " + streetNr);
        System.out.println(plz + " " + city);
        if (showTelNr){
            System.out.println(tel);
        }
        System.out.println("==============================");
        if (noPrize){
            System.out.println("Sie haben leider nichts gewonnen.");
        } else {
            System.out.println("Sie haben folgende Preise gewonnen:");

            if (bookVoucherPrize){
                System.out.println("Büchergutschein");
            }
            if (ballPrize){
                System.out.println("Ball");
            }
            if (penPrize){
                System.out.println("Buntstifte");
            }
            if (newspaperPrize){
                System.out.println("Tageszeitung");
            }
            if (sketchBookPrize){
                System.out.println("Zeichenblock");
            }
            if (pencilPrize){
                System.out.println("Bleistift");
            }
            if (showerGelPrize){
                System.out.println("Duschgel");
            }
            if (cinemaTicketPrize){
                System.out.println("Kinogutschein");
            }
            if (duploStonePrize){
                System.out.println("Duplosteine");
            }
            if (baloonPrize){
                System.out.println(baloonPrizeAmount + " Luftbalons");
            }
        }
    }
}
