package w13.aufgabenKlassen_4;

public class Eisverkauf {
    String bestellung = "";
    int anzahlBestellteKugeln;
    double preis;

    public Eisverkauf(double preis){
        this.preis = preis;
    }

    public void bestellen(String eissorte){
        bestellung = bestellung + eissorte + " ";
        anzahlBestellteKugeln++;
    }

    public String zahlen(){
        return bestellung + preis*anzahlBestellteKugeln+"CHF.";
    }
}
