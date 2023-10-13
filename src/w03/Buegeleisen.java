package w03;

import java.util.Scanner;

public class Buegeleisen {
    public static void main(String[] args) {
        char gewebeart = 'b';
        int temp = 0;
        boolean tempIsNotValid = true;
        boolean gewebeartIsNotValid = true;

        Scanner scanner = new Scanner(System.in);

        while (gewebeartIsNotValid) {
            System.out.print("Geben Sie gie gewünschte gewebeart ein (b=Baumwolle, w=Wolle, s=Seide): ");
            gewebeart = scanner.nextLine().toLowerCase().charAt(0);

            if (gewebeart == 'w' || gewebeart == 's') {
                System.out.println("Hinweis: Verwenden sie eine geeignete Temperatur");
            }

            if (gewebeart != 'b' && gewebeart != 'w' && gewebeart != 's'){
                System.out.println("Die eingegebene Gewebeart ist nicht gültig!");
            }else{
                gewebeartIsNotValid = false;
            }
        }

        while (tempIsNotValid){
            System.out.print("Geben Sie die gewünschte Temperatur ein (zwischen 10°C und 70°C): ");
            temp = scanner.nextInt();

            if (temp > 70 || temp < 10){
                System.out.println("Die eingegebene Temperatur ist unzulässig");
            }else {
                tempIsNotValid = false;
            }
        }

        if (gewebeart == 'b'){
            if (temp < 50){
                System.out.println("Temperaturen unter 50 Grad sind für Baumwolle zu kalt");
            }else{
                System.out.println("Baumwolle kann mit " + temp + "°C gewaschen werden.");
            }
        }
        if (gewebeart == 's'){
            if (temp > 30){
                System.out.println("Temperaturen über 30 Grad sind für Seide zu heiss");
            }else{
                System.out.println("Seide kann mit " + temp + "°C gewaschen werden.");
            }
        }
        if (gewebeart == 'w'){
            if (temp > 40){
                System.out.println("Temperaturen über 40 Grad sind für Wolle zu heiss");
            }else{
                System.out.println("Wolle kann mit " + temp + "°C gewaschen werden.");
            }
        }

    }
}
