package w03;
import java.util.Scanner;

public class WerbeauftrittBewerbung {
    public static void main(String[] args) {

        char gender;
        int age;
        int clothingSize;
        int height;
        int amountForeignLanguages;
        float averageGrade;
        boolean isAccepted = true;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie ihr geschlecht ein (m/w): ");
        gender = scanner.nextLine().charAt(0);

        if(gender != 'w'){
            System.out.println("Kriterium wurde nicht erfüllt");
            isAccepted = false;
        }

        System.out.print("Geben Sie ihr alter ein: ");
        age = scanner.nextInt();

        if(age < 18){
            System.out.println("Kriterium wurde nicht erfüllt");
            isAccepted = false;
        }

        System.out.print("Geben Sie ihre Kleidergrösse ein: ");
        clothingSize = scanner.nextInt();

        if (clothingSize <= 36){
            System.out.println("Kriterium wurde nicht erfüllt");
            isAccepted = false;
        }

        System.out.print("Geben Sie ihre Grösse in cm ein: ");
        height = scanner.nextInt();

        if (height < 170){
            System.out.println("Kriterium wurde nicht erfüllt");
            isAccepted = false;
        }

        System.out.print("Wie viele Fremdsprachen sprechen Sie: ");
        amountForeignLanguages = scanner.nextInt();

        if (amountForeignLanguages < 2){
            System.out.println("Kriterium wurde nicht erfüllt");
            isAccepted = false;
        }

        System.out.print("Geben Sie ihre Durchschnittsnote im Abschlusszeugnis an: ");
        averageGrade = scanner.nextFloat();

        if (averageGrade <= 4.5){
            System.out.println("Kriterium wurde nicht erfüllt");
            isAccepted = false;
        }

        if (isAccepted){
            System.out.println("Akzeptiert");
        }else {
            System.out.println("Nicht akzeptiert");
        }
    }
}
