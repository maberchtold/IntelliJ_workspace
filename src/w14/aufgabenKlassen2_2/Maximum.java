package w14.aufgabenKlassen2_2;

import java.util.Random;

public class Maximum {
    private int nr1 = 0;
    private int nr2 = 0;
    private int nr3 = 0;

    Random rand = new Random();
    public Maximum(int upperLimit){
        nr1 = rand.nextInt(upperLimit);
        nr2 = rand.nextInt(upperLimit);
        nr3 = rand.nextInt(upperLimit);
    }

    public Maximum(){

    }

    public int getNr1() {
        return nr1;
    }

    public int getNr2() {
        return nr2;
    }

    public int getNr3() {
        return nr3;
    }

    public void setNr1(int nr1) {
        this.nr1 = nr1;
    }

    public void setNr2(int nr2) {
        this.nr2 = nr2;
    }

    public void setNr3(int nr3) {
        this.nr3 = nr3;
    }

    public int max_3(){
        int biggestNr = 0;
        if (nr1 > nr2 && nr1 > nr3){
            biggestNr = nr1;
        }
        if (nr2 > nr1 && nr2 > nr3){
            biggestNr = nr2;
        }
        if (nr3 > nr1 && nr3 > nr2){
            biggestNr = nr3;
        }
        return biggestNr;
    }

    public boolean max_1(int number){
        boolean retBool = false;

        if (number > nr1 && number > nr2 && number > nr3){
            retBool = true;
        }

        return retBool;
    }

    public void max_set(int number){
        int smallestNumber = 0;
        int numberSelector = 0;
        
        if (nr1 < nr2 && nr1 < nr3){
            smallestNumber = nr1;
            numberSelector = 1;
        }
        if (nr2 < nr1 && nr2 < nr3){
            smallestNumber = nr2;
            numberSelector = 2;
        }
        if (nr3 < nr1 && nr3 < nr2){
            smallestNumber = nr3;
            numberSelector = 3;
        }
        
        if (number > smallestNumber){
            if (numberSelector == 1){
                nr1 = number;
            } else if (numberSelector == 2) {
                nr2 = number;
            } else if (numberSelector == 3) {
                nr3 = number;
            }
        }
    }

    @Override
    public String toString() {
        return "Maximum{" +
                "nr1=" + nr1 +
                ", nr2=" + nr2 +
                ", nr3=" + nr3 +
                '}';
    }
}
