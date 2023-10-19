package practicalWork;

import java.util.Locale;
import java.util.Scanner;

public class Idealgewicht {
    public static void main(String[] args) {
        char gender = 'm';
        double weight = 0;
        double height = 0;
        double age = 0;
        double inputWeight = 0;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        do {
            System.out.print("Sind Sie ein Mann oder eine Frau (m/f): ");
            gender = scanner.nextLine().charAt(0);
        } while (gender != 'm' && gender != 'f');

        System.out.print("Geben Sie Ihre grösse in cm ein: ");
        height = scanner.nextDouble();

        System.out.print("Geben Sie Ihr alter ein: ");
        age = scanner.nextDouble();

        System.out.print("Geben Sie Ihr gewicht ein: ");
        inputWeight = scanner.nextDouble();

        if (gender == 'm') {
            weight = height - 100 - ((height-150)/4) + ((age-20)/4);
        } else {
            weight = height - 100 - ((height-150)/2.5) + ((age-20)/6);
        }

        System.out.println("Ihr Idealgewicht liegt bei "+weight+"kg.");
        System.out.println("Sie wiegen "+inputWeight+"kg.");
        
        if (inputWeight > weight*1.15){
            System.out.println("Sie neigen zu übergewicht.");
        } else if (inputWeight < weight*0.9) {
            System.out.println("Sie neigen zu untergewicht.");
        }

    }
}