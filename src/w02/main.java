package w02;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // switch variable values
        //switchVariableValues();

        //calculate averageMark
        //calculateAverageMark();

        //convert decimal to binary
        //convertDecimalToBinary(500);

        //Calculate circle values with radius
        //calculateCircleViaRadius(6);

        //calculate average age by year
        averageAgeByYear();

        //calculate how much nutella is needed
        //howMuchNutellaIsNeeded();

        //calculate cube volume and surface area
        //calculateCube();
    }

    static void switchVariableValues() {

        int a = 5;
        int b = 10;
        int c;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    static void calculateAverageMark(){
        float noteE = 5.5f;
        float noteT1 = 4.5f;
        float noteT2 = 6.0f;
        float notePa1 = 6.0f;
        float notePa2 = 6.0f;
        float notePa3 = 6.0f;
        float durchschnitt;
        float durchnittPa;

        durchnittPa = ((notePa1 + notePa2 + notePa3) / 3 );

        noteT2 = ((3*noteT2) + durchnittPa ) / 4;

        durchschnitt = (noteE * 2 + noteT1 + noteT2) / 4;


        System.out.println("The average mark is: "+durchschnitt);
    }
    static void convertDecimalToBinary(int number) {
        int initalNumber = number;
        String binaryString = "";
        int remainder;

        while (number > 0) {
            remainder = number % 2;
            binaryString = remainder + binaryString;
            number = number / 2;
        }

        System.out.println(initalNumber + " in binary is: " + binaryString);
    }

    static void calculateCircleViaRadius(double radius) {
        // Berechne den Durchmesser
        double durchmesser = 2 * radius;

        // Berechne den Kreisumfang
        double kreisumfang = 2 * 3.14 * radius;

        // Berechne die Kreisfläche
        double kreisflaeche = 3.14 * Math.pow(radius, 2);

        // Gib die Ergebnisse aus
        System.out.println("Radius des Kreises: " + radius + " cm");
        System.out.println("Durchmesser des Kreises: " + durchmesser + " cm");
        System.out.println("Kreisumfang: " + kreisumfang + " cm");
        System.out.println("Kreisfläche: " + kreisflaeche + " cm²");
    }
    static void averageAgeByYear() {
        Scanner scanner = new Scanner(System.in);

        int currentYear = 2023;

        System.out.print("Enter the number of different birth years to input: ");
        int yearsCount = scanner.nextInt();

        int totalAge = 0;
        int totalChildren = 0;

        for (int i = 0; i < yearsCount; i++) {
            System.out.print("Enter the birth year: ");
            int birthYear = scanner.nextInt();

            System.out.print("Enter the number of children born in " + birthYear + ": ");
            int childrenCountInYear = scanner.nextInt();

            int age = currentYear - birthYear;

            totalAge += age * childrenCountInYear;
            totalChildren += childrenCountInYear;
        }

        int averageAge = totalAge / totalChildren;

        System.out.println("The average Age is: " + averageAge);

        // Close the scanner when done to release resources
        scanner.close();
    }

    static void howMuchNutellaIsNeeded() {

        int participants = 60;

        double a = 11.0;
        double b = 9.0;

        double thicknessSpread = 0.2 / 10.0;
        double volumeBread = a * b * thicknessSpread / 1000.0; // Conversion from cm³ to liters
        int breadsPerParticipant = 2;
        double totalVolume = participants * breadsPerParticipant * volumeBread;
        double jarSize = 0.3;

        int requiredJars = (int) Math.ceil(totalVolume / jarSize);

        System.out.println("For " + participants + " participants you'l need " + requiredJars + " jars of nutella.");
    }

    static void calculateCube(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the edge length of the cube in cm: ");
        float edgeLength = scanner.nextFloat();

        float surfaceArea = 0f;
        float volume = 0f;

        surfaceArea = 6 * edgeLength * edgeLength;
        volume = edgeLength * edgeLength * edgeLength;

        System.out.println("Surface Area: " + surfaceArea + " cm^2");
        System.out.println("Volume: " + volume + " cm^3");

        scanner.close();
    }
}
