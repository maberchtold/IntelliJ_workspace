package w09_Mehrdimensionale_Arrays;

import java.util.Random;

public class MehrdimensionaleArrays_4 {
    static final int MATRIX_ROWS = 10;
    static final int MATRIX_COLUMNS = 10;
    public static void main(String[] args) {
        int[][] matrixArray = new int [MATRIX_ROWS + 2][MATRIX_COLUMNS + 2];
        int[] sumArray = new int[MATRIX_COLUMNS];
        int[] singleDigitArray = new int[MATRIX_COLUMNS];
        int smallestRowNr = 100;
        int biggestRowNr = 0;

        Random rand = new Random();

        for (int i = 0; i < matrixArray.length-2; i++) {
            for (int j = 0; j < matrixArray[i].length-2; j++){
                matrixArray[i][j] = rand.nextInt(100);

                if (smallestRowNr > matrixArray[i][j]){
                    smallestRowNr = matrixArray[i][j];
                }
                if (biggestRowNr < matrixArray[i][j]){
                    biggestRowNr = matrixArray[i][j];
                }

                    sumArray[j] = sumArray[j] + matrixArray[i][j];

                if (matrixArray[i][j] < 10) {
                    singleDigitArray[j]++;
                }
            }
            matrixArray[i][matrixArray[i].length-2] = smallestRowNr;
            matrixArray[i][matrixArray[i].length-1] = biggestRowNr;
            smallestRowNr = 100;
            biggestRowNr = 0;
        }

        for (int i = 0; i < sumArray.length; i++) {
            matrixArray[MATRIX_COLUMNS][i] = sumArray[i];
        }

        for (int i = 0; i < singleDigitArray.length; i++) {
            matrixArray[MATRIX_COLUMNS+1][i] = singleDigitArray[i];
        }

        //Print matrix
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++){
                System.out.printf("%4d", matrixArray[i][j]);
                if (j == matrixArray[i].length-3){
                    System.out.printf("%4s", "|");
                }
            }
            if (i == matrixArray.length - 3) {
                System.out.println();
                for (int j = 0; j < matrixArray[i].length + 1; j++){
                    System.out.printf("%4s", "----");
                }
            }
            System.out.println();
        }
    }
}
