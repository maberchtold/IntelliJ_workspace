package w10;

public class AufgabenMethodenMitRueckgabewert_5 {
    public static void main(String[] args) {
        //get value of array
        int[] intArr = {4,7,9,2,432,67,234,67,2342,6,23,4,88};
        System.out.println(getArrValue(intArr, 0));

        //Search index
        String search = "heehee";
        String[] strArr = {"hello","what", "heehee", "testus"};
        System.out.println(searchIndex(strArr, search));

        //getFollowingNumbers
        int[] nrArr = {5,3,7,2,8,9,3,3,3,0,4,5,6,3};
        System.out.println(getFollowingNumbers(nrArr, 3, 3));
    }

    public static int getArrValue(int[] arr, int index){
        if (index < 0 || index > arr.length - 1){
            return -1;
        }
        return arr[index];
    }

    public static int searchIndex(String[] arr, String search){
        int retrVal = -1;
        String arrStr = "";
        boolean correctIndex = true;

        for (int i = 0; i < arr.length; i++){
            correctIndex = true;
            arrStr = arr[i];

            for (int  j = 0; j < arrStr.length(); j++){
                if (arrStr.length() != search.length()){
                    correctIndex = false;
                } else if (arrStr.charAt(j) != search.charAt(j)) {
                    correctIndex = false;
                }
            }

            if (correctIndex){
                retrVal = i;
            }

        }

        return retrVal;
    }

    public static boolean getFollowingNumbers(int[] arr, int searched, int amount){
        boolean isValid = false;
        int counter = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == searched){
                counter++;
                if (counter == amount){
                    isValid = true;
                }
            }else {
                counter = 0;
            }
        }

        return isValid;
    }
}
