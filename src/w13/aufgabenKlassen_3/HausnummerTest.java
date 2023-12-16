package w13.aufgabenKlassen_3;

public class HausnummerTest {
    public static void main(String[] args) {
        Hausnummer h1 = new Hausnummer();
        Hausnummer h2 = new Hausnummer(6);
        Hausnummer h3 = new Hausnummer(8,9);
        Hausnummer h4 = new Hausnummer(1,2,3);

        h1.print();
        h1.reverse();
        h2.print();
        h2.reverse();
        h3.print();
        h3.reverse();
        h4.print();
        h4.reverse();
    }
}
