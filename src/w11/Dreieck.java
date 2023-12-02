package w11;

import java.util.Random;

public class Dreieck {
    public static void main(String[] args) {
        float[] retArr;
        retArr = kanteC();
        System.out.println("Kante a: "+retArr[0]+"cm");
        System.out.println("Kante b: "+retArr[1]+"cm");
        System.out.println("Kante c: "+retArr[2]+"cm");
    }

    public static int kanteA(){
        int ret;
        Random rand = new Random();

        ret = (rand.nextInt(10)+1);
        return ret;
    }

    public static int kanteB(){
        int ret;
        Random rand = new Random();

        ret = (rand.nextInt(10)+1);
        return ret;
    }

    public static float[] kanteC(){
        float[] retArr = new float[3];
        float kanteA = kanteA();
        float kanteB = kanteB();
        double kanteC = 0f;


        kanteC = Math.sqrt(Math.pow(kanteA,2) + Math.pow(kanteB,2));


        retArr[0] = kanteA;
        retArr[1] = kanteB;
        retArr[2] = (float) kanteC;
        return retArr;
    }
}
