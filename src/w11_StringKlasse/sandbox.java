package w11_StringKlasse;

public class sandbox {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        float c = 3.5f;
        float d = 6.6f;

        String str = "heehee";
        char[] strArr;
        strArr = str.toCharArray();
        System.out.println(str.toUpperCase().charAt(0));
        //System.out.println(sumCalc(a,d));
    }

    public static float sumCalc(float a, float b){
        float res = 0f;
        res = a + b;

        return res;
    }
}
