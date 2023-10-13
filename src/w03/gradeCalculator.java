package w03;

import java.util.Locale;
import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        float grade1;
        float grade2;
        float grade3;
        float grade4;
        float average;

        Scanner scanner = new Scanner(System.in).useLocale( Locale.US );

        System.out.print("Enter the first grade: ");
        grade1 = scanner.nextFloat();
        System.out.print("Enter the second grade: ");
        grade2 = scanner.nextFloat();
        System.out.print("Enter the third grade: ");
        grade3 = scanner.nextFloat();
        System.out.print("Enter the fourth grade: ");
        grade4 = scanner.nextFloat();

        average = (grade1 + grade2 + grade3 + grade4) / 4;

        if (average >= 5.5){
            System.out.println("very good");
        }
        if (average >= 5 && average < 5.5){
            System.out.println("good");
        }
        if (average >= 4.5 && average < 5){
            System.out.println("satisfactory");
        }
        if (average >= 4 && average < 4.5){
            System.out.println("sufficient");
        }
        if (average < 4){
            System.out.println("failed");
        }
    }
}
