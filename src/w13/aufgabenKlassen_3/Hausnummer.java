package w13.aufgabenKlassen_3;

import java.util.Random;

public class Hausnummer {
    Random rand = new Random();
    int nr1,nr2,nr3;

    public Hausnummer(int nr1, int nr2, int nr3){
        this.nr1 = nr1;
        this.nr2 = nr2;
        this.nr3 = nr3;
    }

    public Hausnummer(){
        nr1 = rand.nextInt(10);
        nr2 = rand.nextInt(10);
        nr3 = rand.nextInt(10);
    }

    public Hausnummer(int nr1){
        this.nr1 = nr1;
        nr2 = rand.nextInt(10);
        nr3 = rand.nextInt(10);
    }

    public Hausnummer(int nr1, int nr2){
        this.nr1 = nr1;
        this.nr2 = nr2;
        nr3 = rand.nextInt(10);;
    }

    public void print(){
        System.out.println(""+nr1+nr2+nr3);
    }

    public void reverse(){
        System.out.println(""+nr3+nr2+nr1);
    }
}
