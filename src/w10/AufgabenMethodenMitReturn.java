package w10;

public class AufgabenMethodenMitReturn {
    public static void main(String[] args) {
        //Addition Method
        System.out.println(sum(5,6));

        //compare two chars
        System.out.println(compareChars('f','f'));

        //compare two ints
        System.out.println(compareInts(4,5));

        //get lowest nr in array
        int[] arr = {3,6,3,57,43,2,55,75};
        System.out.println(getMinNrInArr(arr));

        //check if array is square
        int[][] arrSquare = {{4,6,4,3},{5,7,4,6},{4,6,3,3},{4,9,3,0}};
        System.out.println(isArrSqare(arrSquare));
    }

    public static int sum(int a, int b){
        int e;
        e = a + b;
        return e;
    }

    public static boolean compareChars(char a, char b){
        if(a==b){
            return true;
        }else{
            return false;
        }
    }

    public static int compareInts(int a, int b){
        if(a==b){
            return 0;
        } else if (a<b) {
            return -1;
        }else {
            return 1;
        }
    }

    public static int getMinNrInArr(int[] arr){
        int min;
        min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }

    public static boolean isArrSqare(int[][] arr){
        boolean isSqare = true;

        for (int i = 0; i < arr.length; i++){
            if(arr.length != arr[i].length){
                isSqare = false;
            }
        }

        if (isSqare){
            return true;
        }else {
            return false;
        }
    }

}
