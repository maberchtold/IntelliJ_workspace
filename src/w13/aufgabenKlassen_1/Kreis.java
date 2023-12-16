package w13.aufgabenKlassen_1;

public class Kreis {
    double radius;

    public Kreis(double radius){
        this.radius = radius;
    }

    public double kreisUmfang(){
        return 2 * Math.PI * radius;
    }

    public double kreisFlaeche(){
        return Math.PI * (Math.pow(radius, 2));
    }
}
