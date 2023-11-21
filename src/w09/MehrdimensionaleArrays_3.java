package w09;

import java.util.Scanner;

public class MehrdimensionaleArrays_3 {
    public static void main(String[] args) {
        int anzKinder = 0;
        int[][] alter;
        int siblingCount = 0;
        int averageCounter = 0;
        int averageAgeCount = 0;
        int averageAge = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie an wie viele Kinder in der Klasse sind: ");
        anzKinder = scanner.nextInt();

        alter = new int[anzKinder][];

        for (int i = 0; i < alter.length; i++){
            System.out.print("Geben Sie die anzahl Geschwister des " + (i+1) +". Kindes ein: ");
            siblingCount = scanner.nextInt();
            alter[i] = new int[siblingCount + 1];
            System.out.print("Geben Sie das Alter des " + (i+1) +". Kindes ein: ");
            alter[i][0] = scanner.nextInt();

            for (int j = 1; j < alter[i].length; j++) {
                System.out.print("Geben Sie das Alter des " + (j) +". Geschwister des " + (i+1) +". Kindes ein: ");
                alter[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < alter.length; i++){
            System.out.printf("%3s", (i+1)+":");
            System.out.printf("%3s", alter[i][0]);
            averageAgeCount = averageAgeCount + alter[i][0];
            averageCounter++;
            for (int j = 1; j < alter[i].length; j++) {
                System.out.printf("%3s", alter[i][j]);
                averageAgeCount = averageAgeCount + alter[i][j];
                averageCounter++;
            }
            System.out.println();
        }

        averageAge = averageAgeCount / averageCounter;
        System.out.println("Das Durchschnittsalter aller Kinder beträgt: " + averageAge);
    }
}
