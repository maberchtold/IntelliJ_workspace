package abschlusspruefung;

public class Bewertungsraster {
    public static void main(String[] args) {
        double[][] daten = {{7, 8, 6},
                            {4, 5, 9},
                            {6, 6, 5}};

        double[] gewichte = {3, 2, 4};

        double[] mittelwerte;

        anzeigen(daten);
        mittelwerte = mittelwert(daten);
        wahlSoftware(mittelwerte);

        mittelwerte = mittelwertGewicht(daten, gewichte);
        wahlSoftware(mittelwerte);

        filter(daten, 1,2,7);
    }

    public static void anzeigen(double[][] dblArr){
        for (int i = 0; i < dblArr.length; i++){
            for (int j = 0; j < dblArr[i].length; j++){
                System.out.printf("%5.1f",dblArr[i][j]);
            }
            System.out.println();
        }
    }

    public static double[] mittelwert(double[][] dblArr){
        double[] retArr = new double[dblArr.length];
        int mittelwert = 0;
        int sum = 0;

        for (int i = 0; i < dblArr.length; i++){
            mittelwert = 0;
            sum = 0;
            for (int j = 0; j < dblArr[i].length; j++){
                sum += dblArr[i][j];
            }
            mittelwert = sum / dblArr[i].length;
            retArr[i] = mittelwert;
        }

        return retArr;
    }

    public static void wahlSoftware(double[] mittelwertArr){
        int biggestIndex = 0;
        for (int i = 0; i < mittelwertArr.length; i++){
            if (mittelwertArr[i] > mittelwertArr[biggestIndex]){
                biggestIndex = i;
            }
        }

        System.out.println("Software " + (biggestIndex+1) + " ist gewählt mit " + mittelwertArr[biggestIndex]+" Punkten.");
    }

    public static double summeGewicht(double[] gewArr){
        double summe = 0;
        for (int i = 0; i < gewArr.length; i++){
            summe += gewArr[i];
        }
        return summe;
    }

    public static double[] mittelwertGewicht(double[][] dblArr, double[] gewichte){
        double[] retArr = new double[dblArr.length];
        double sumGewichte = summeGewicht(gewichte);
        double mittelwert = 0;
        double sum = 0;

        for (int i = 0; i < dblArr.length; i++){
            mittelwert = 0;
            sum = 0;
            for (int j = 0; j < dblArr[i].length; j++){
                sum += dblArr[i][j] * gewichte[j];
            }
            mittelwert = sum / sumGewichte;
            retArr[i] = mittelwert;
        }

        return retArr;
    }

    public static void filter(double[][] dblArr, int column1, int column2, int minVal){
        boolean isValid = true;
        for (int i = 0; i < dblArr.length; i++){
            isValid = true;

            if (dblArr[i][column1-1] >= minVal && dblArr[i][column2-1] >= minVal){
                System.out.println("Software " + (i+1) + " entspricht den Kriterien");
            }

        }
    }
}
