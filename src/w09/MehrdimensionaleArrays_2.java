package w09;

public class MehrdimensionaleArrays_2 {
    static final int MATRIX_ROWS = 10;
    static final int MATRIX_COLUMNS = 10;
    public static void main(String[] args) {
        int[][] matrixArray = new int[MATRIX_ROWS+1][MATRIX_COLUMNS + 1];

        for (int i = 1; i < matrixArray.length; i++) {
            for (int j = 1; j < matrixArray[i].length; j++) {
                matrixArray[i][j] = i * j;
            }
        }

        for (int i = 1; i < matrixArray.length; i++) {
            for (int j = 1; j < matrixArray[i].length; j++) {
                System.out.printf("%4d", matrixArray[i][j]);
            }
            System.out.println();
        }
    }
}
