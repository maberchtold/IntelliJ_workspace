package w13.aufgabenKlassen_1;

public class KreisTest {
    public static void main(String[] args) {
        Kreis k1 = new Kreis(4.4);
        Kreis k2 = new Kreis(6.6);

        double umfangK1;
        double flaecheK1;
        double umfangK2;
        double flaecheK2;

        umfangK1 = k1.kreisUmfang();
        flaecheK1 = k1.kreisFlaeche();
        umfangK2 = k2.kreisUmfang();
        flaecheK2 = k2.kreisFlaeche();

        System.out.println("umfangK1: " + umfangK1);
        System.out.println("flaecheK1: " + flaecheK1);
        System.out.println("umfangK2: " + umfangK2);
        System.out.println("flaecheK2: " + flaecheK2);
    }
}
