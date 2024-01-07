package w14.aufgabenKlassen2_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    private int[] mainArr;
    private int arrLength;
    Random rand = new Random();
    public Array(int arrLength){
        this.arrLength = arrLength;
        mainArr = new int[arrLength];
    }

    public boolean setValue(int index, int val){
        boolean successBool = true;
        if (index >= 0 && index < mainArr.length){
            mainArr[index] = val;
        }else{
            successBool = false;
        }

        return successBool;
    }

    public void setRandom(){
        int randNr = 0;
        for (int i = 0; i < mainArr.length; i++){
            mainArr[i] = rand.nextInt(100);
        }
    }

    public void printAll(){
        for (int i = 0; i < mainArr.length; i++){
            System.out.println(mainArr[i]);
        }
    }

    public void sumElements(){
        int sumArr = 0;
        for (int i = 0; i < mainArr.length; i++){
            sumArr += mainArr[i];
        }
        System.out.println("SUM: "+sumArr);
    }

    public void resetAll(){
        for (int i = 0; i < mainArr.length; i++){
            mainArr[i] = 0;
        }
    }
    @Override
    public String toString() {
        return Arrays.toString(mainArr);
    }
}
