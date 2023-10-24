package practicalWork;

import java.util.Locale;
import java.util.Scanner;

public class Notenverwaltung {
    public static void main(String[] args) {
        float grade1 = 0;
        float grade2 = 0;
        float grade3 = 0;
        float grade4 = 0;
        float grade5 = 0;
        float averageGrade = 0;
        int aboveAverageCount = 0;
        int belowAverageCount = 0;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Geben Sie die 1. Note ein: ");
        grade1 = scanner.nextFloat();

        System.out.print("Geben Sie die 2. Note ein: ");
        grade2 = scanner.nextFloat();

        System.out.print("Geben Sie die 3. Note ein: ");
        grade3 = scanner.nextFloat();

        System.out.print("Geben Sie die 4. Note ein: ");
        grade4 = scanner.nextFloat();

        System.out.print("Geben Sie die 5. Note ein: ");
        grade5 = scanner.nextFloat();

        averageGrade = (grade1+grade2+grade3+grade4+grade5) / 5;

        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("Notendurchschnitt: "+averageGrade);
        if (grade1 >= 4.0 && grade3 >= 4.0 && grade4 >= 4.0){
            System.out.println("Sie haben P1, P3 und P4 bestanden");
        }else{
            System.out.println("Sie haben P1, P3 und P4 nicht bestanden");
        }
        if (grade2 >= 4.0 && grade5 >= 4.0){
            System.out.println("Sie haben P2 und P5 bestanden");
        }else{
            System.out.println("Sie haben P2 und P5 nicht bestanden");
        }
        if (grade1 >= 4.0 && grade2 >= 4.0 && grade3 >= 4.0 && grade4 >= 4.0 && grade5 >= 4.0){
            System.out.println("Sie haben alle Prüfungen bestanden.");
        }else {
            System.out.println("Sie haben nicht alle Prüfungen bestanden.");
        }

        if (grade1 >= averageGrade){
            aboveAverageCount++;
        }
        if (grade2 >= averageGrade){
            aboveAverageCount++;
        }
        if (grade3 >= averageGrade){
            aboveAverageCount++;
        }
        if (grade4 >= averageGrade){
            aboveAverageCount++;
        }
        if (grade5 >= averageGrade){
            aboveAverageCount++;
        }

        if (grade1 < averageGrade){
            belowAverageCount++;
        }
        if (grade2 < averageGrade){
            belowAverageCount++;
        }
        if (grade3 < averageGrade){
            belowAverageCount++;
        }
        if (grade4 < averageGrade){
            belowAverageCount++;
        }
        if (grade5 < averageGrade){
            belowAverageCount++;
        }

        System.out.println(aboveAverageCount + " Noten sind gleich oder Grösser als der Durchschnitt\n"+belowAverageCount+" Noten liegen unter dem Durchschnitt");

        System.out.println("------------------------------------------------");
        System.out.println();
    }
}
