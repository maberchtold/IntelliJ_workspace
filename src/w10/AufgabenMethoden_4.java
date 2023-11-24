package w10;

import java.util.Scanner;

public class AufgabenMethoden_4 {
    public static void main(String[] args) {
        kreisUmfang();
        kreisFlaeche();
    }

    public static void kreisUmfang(){
        float radius = 0f;
        float umfang = 0f;
        float pi = 3.1415f;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Kreis Radius in m ein: ");
        radius = scanner.nextInt();

        umfang = (2*radius) * pi;

        System.out.println("Der Kreisumfang beträgt: "+umfang+"m");
    }

    public static void kreisFlaeche(){
        float radius = 0f;
        float flaeche = 0f;
        float pi = 3.1415f;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Kreis Radius in m ein: ");
        radius = scanner.nextInt();

        flaeche = (radius*radius) * pi;

        System.out.println("Die Kreisfläche beträgt: "+flaeche+"m^2");
    }
}
