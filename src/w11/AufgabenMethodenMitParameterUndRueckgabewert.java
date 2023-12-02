package w11;

public class AufgabenMethodenMitParameterUndRueckgabewert {
    public static void main(String[] args) {
        //Aufgabe 1
        System.out.println("Aufgabe 1:");
        double[] doubleVal1 = {4.5,7,3,8.8,9};
        int intVal1 = 7;
        System.out.println(theMethod(doubleVal1, intVal1));

        //Aufgabe 2
        System.out.println("Aufgabe 2:");
        String[] retArr2;
        float floatVal2 = 5f;
        String strVal2 = "heehee";
        retArr2 = theMethod(floatVal2, strVal2);
        for (int i = 0; i < retArr2.length; i++) {
            System.out.print(retArr2[i]);
            System.out.print(",");
        }

        //Aufgabe 3
        System.out.println("Aufgabe 3:");
        float[][] retArr3;
        retArr3 = theMethod();
        for (int i = 0; i < retArr3.length; i++){
            for (int j = 0; j < retArr3[i].length; j++){
                System.out.print(retArr3[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        //Aufgabe 4
        System.out.println("Aufgabe 4:");
        int[] intArr4 = {4,6,8,2,45,7,4,88};
        int intVal4 = 2;
        System.out.println(theMethod(intArr4, intVal4));

        //Aufgabe 5
        System.out.println("Aufgabe 5:");
        double dblVal5 = 6.6;
        boolean boolVal5 = false;
        theMethod(dblVal5,boolVal5);

        //Aufgabe 6
        System.out.println("Aufgabe 6:");
        boolean[][] boolArr6 = {{true,false,false},{true,false,true}};
        int intVal6 = 2;
        System.out.println(theMethod(boolArr6,intVal6));

        //Aufgabe 7
        System.out.println("Aufgabe 7:");
        double[][] retArr7;
        double dblVal7 = 9.9;
        float fltVal7 = 6.6f;
        retArr7 = theMethod(dblVal7,fltVal7);
        System.out.println(retArr7[0][0]);
        System.out.println(retArr7[1][0]);
    }

    public static boolean theMethod(double[] arr, int value){
        //check if int value is in arr
        boolean valueIsInArr = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                valueIsInArr = true;
            }
        }
        return valueIsInArr;
    }

    public static String[] theMethod(float flt, String str){
        //Define Array Size and put string in array
        int arrSize = (int)flt;
        String[] retArr = new String[arrSize];
        for (int i = 0; i < retArr.length; i++){
            retArr[i] = str;
        }

        return retArr;
    }

    public static float[][] theMethod(){
        float[][] retArr = {{5f,5f,5f,5f,4.4f,2.3f},{2f,4f,5f,5f,4.7f,2.9f}};
        return retArr;
    }

    public static int theMethod(int[] intArr, int index){
        //Return value by index
        return intArr[index];
    }

    public static void theMethod (double dbl, boolean bool){
        //Nothing happens
    }

    public static String theMethod(boolean[][] boolArr, int row){
        //print bool arr row
        String retStr = "";

        for (int i = 0; i < boolArr[row - 1].length; i++) {
            retStr += boolArr[row - 1][i];
            retStr += " ";
        }
        return retStr;
    }

    public static double[][] theMethod(double dbl, float flt){
        double[][] retArr = {{dbl},{flt}};
        return retArr;
    }
}
