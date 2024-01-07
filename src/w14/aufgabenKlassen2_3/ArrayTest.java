package w14.aufgabenKlassen2_3;

public class ArrayTest {
    public static void main(String[] args) {
        Array arr = new Array(20);

        System.out.println(arr.setValue(0,55));
        arr.setRandom();
        arr.printAll();
        arr.sumElements();
        //System.out.println(arr.toString());
        arr.resetAll();
        System.out.println(arr.toString());
    }
}
