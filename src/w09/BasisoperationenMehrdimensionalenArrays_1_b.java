package w09;

import java.util.Random;
import java.util.Scanner;

public class BasisoperationenMehrdimensionalenArrays_1_b {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int[][] zufallszahlen;

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben sie die erste Dimension des Arrays ein: ");
        x = scanner.nextInt();

        System.out.print("Geben sie die zweite Dimension des Arrays ein: ");
        y = scanner.nextInt();

        zufallszahlen = new int[x][y];

        for (int i = 0; i < zufallszahlen.length; i++){
            for (int j = 0; j < zufallszahlen[i].length; j++) {
                zufallszahlen[i][j] = rand.nextInt(100);
            }
        }

        //system out
        for (int i = 0; i < zufallszahlen.length; i++){
            for (int j = 0; j < zufallszahlen[i].length; j++) {
                System.out.printf("%3d",zufallszahlen[i][j]);
            }
            System.out.println();
        }
    }
}
