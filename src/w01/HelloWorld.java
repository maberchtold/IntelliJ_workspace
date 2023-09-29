package w01;

public class HelloWorld {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("\n===================");
        System.out.println("Aufgabe 1");
        System.out.println("===================\n");

        System.out.println("* * * * *");
        System.out.println(" * * * * *");
        System.out.println("* * * * *");
        System.out.println(" * * * * *");
        System.out.println("");

        System.out.print("* * * * *\n");
        System.out.print(" * * * * *\n");
        System.out.print("* * * * *\n");
        System.out.print(" * * * * *\n");

        System.out.println("\n=========================");
        System.out.println("Aufgabe 3 - Adressausgabe");
        System.out.println("=========================\n");

        //Store address information in variables
        String lastName = "Berchtold";
        String firstName = "Matteo";
        String street = "Bammattenweg";
        String streetNr = "6";
        int plz = 3904;
        String city = "Naters";

        //Print variables

        System.out.printf("-------------------------------------------------------------------------------------------------------------%n");
        System.out.printf("                                                   Adresses%n");

        System.out.printf("-------------------------------------------------------------------------------------------------------------%n");
        System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n", "Lastname", "Firstname", "Street", "Nr", "PLZ", "City");
        System.out.printf("-------------------------------------------------------------------------------------------------------------%n");

        System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n", lastName, firstName,  street, streetNr, plz, city);

        lastName = "John";
        firstName = "Doe";
        street = "Bahnhofstrasse";
        streetNr = "22";
        plz = 6666;
        city = "Test";

        System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n", lastName, firstName,  street, streetNr, plz, city);


        System.out.printf("-------------------------------------------------------------------------------------------------------------%n");

    }

}
