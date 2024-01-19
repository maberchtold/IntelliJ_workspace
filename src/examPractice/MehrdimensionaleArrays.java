package examPractice;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class MehrdimensionaleArrays {
    public static void main(String[] args) {
        //1

        int[][] arr;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int arrX = 0;
        int arrY = 0;
        int rowIndex = 0;
        int columnIndex = 0;
        int coordX = 0;
        int coordY = 0;
        int coordXminus = 0;
        int coordYminus = 0;
        int coordXplus = 0;
        int coordYplus = 0;
        int bereich = 0;
        String bereichString = "";

        System.out.print("Geben Sie Ausmasse des arrays ein: ");
        arrX = scanner.nextInt();
        arrY = scanner.nextInt();

        arr = new int[arrX][arrY];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = rand.nextInt(100);
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
        /*
        System.out.print("Geben Sie einen gewünschten Zeilenindex ein: ");
        rowIndex = scanner.nextInt();

        for(int i = 0; i < arr[rowIndex].length; i++){
            System.out.printf("%3d", arr[rowIndex][i]);
        }
        System.out.println();

        System.out.print("Geben Sie einen gewünschten Columnindex ein: ");
        columnIndex = scanner.nextInt();

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i][columnIndex]);
        }
        */

        System.out.print("Geben Sie die koordinaten ein: ");
        coordX = scanner.nextInt();
        coordY = scanner.nextInt();
        coordXminus = coordX;
        coordYminus = coordY;
        coordXplus = coordX;
        coordYplus = coordY;

        System.out.print("Geben Sie den Bereich ein: ");
        bereich = scanner.nextInt();

        bereichString = bereichString + arr[coordX][coordY];

        for (int i = bereich + 1; i >= bereich; i--){
            coordYminus--;
            if (coordYminus < 0){
                coordXminus--;
                coordYminus = arr[coordXminus].length - 1;
            }
            bereichString = arr[coordXminus][coordYminus] + " " + bereichString;
        }

        for (int i = 0; i < bereich; i++){
            coordYplus++;
            if (coordYplus > arr[coordXplus].length - 1){
                coordXplus++;
                coordYplus = 0;
            }
            bereichString = bereichString + " " + arr[coordXplus][coordYplus];
        }

        System.out.println(bereichString);

    }
}
