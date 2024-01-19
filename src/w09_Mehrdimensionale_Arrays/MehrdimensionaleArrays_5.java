package w09_Mehrdimensionale_Arrays;

import java.util.Scanner;

public class MehrdimensionaleArrays_5 {
    public static void main(String[] args) {
        int[][] seats;
        int rows = 0;
        int columns = 0;
        int selectedRow = 0;
        int selectedColumn = 0;
        int userInput = 0;
        boolean invalidInput = true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die anzahl Reihen im Kino ein: ");
        rows = scanner.nextInt();

        System.out.print("Geben Sie die anzahl Stühle in einer Reihe ein: ");
        columns = scanner.nextInt();

        seats = new int[rows][columns];

        while (invalidInput){
            System.out.println();
            System.out.println("1) Reservieren Sie einen Sitz");
            System.out.println("2) Kinosaal anzeigen");
            System.out.println("3) Programm beenden");
            System.out.print("Wählen Sie:");
            userInput = scanner.nextInt();

            switch (userInput){
                case 1:
                    System.out.print("Wählen Sie eine Reihe aus:");
                    selectedRow = scanner.nextInt();
                    selectedRow--;
                    System.out.print("Wählen Sie eine Spalte aus:");
                    selectedColumn = scanner.nextInt();
                    selectedColumn--;

                    if (seats[selectedRow][selectedColumn] == 1){
                        System.out.println("Der Sitz ist bereits reserviert.");
                    }else {
                        seats[selectedRow][selectedColumn] = 1;
                        System.out.println("Der Sitz wurde erfolgreich reserviert.");
                    }
                    break;
                case 2:
                    for (int i = 0; i < seats.length; i++){
                        for (int j = 0; j < seats[i].length; j++) {
                            System.out.printf("%3d",seats[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    invalidInput = false;
                    break;
                default:
                    System.out.println("Wählen Sie einen gültigen Menupunkt aus.");
                    break;
            }
        }
    }
}
