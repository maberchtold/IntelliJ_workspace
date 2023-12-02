package w11;

public class sandbox {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        float c = 3.5f;
        float d = 6.6f;

        System.out.println(sumCalc(a,d));
    }

    public static float sumCalc(float a, float b){
        float res = 0f;
        res = a + b;

        return res;
    }
}
