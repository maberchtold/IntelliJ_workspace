package w13.aufgabenKlassen_2;

import java.util.Locale;
import java.util.Scanner;

public class PersonTest {
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public static void main(String[] args) {
        String firstname,lastname;
        int age;

        System.out.print("Geben Sie ihren vornamen ein: ");
        firstname = scanner.nextLine();
        System.out.print("Geben Sie ihren nachnamen ein: ");
        lastname = scanner.nextLine();
        System.out.print("Geben Sie ihr alter ein: ");
        age = scanner.nextInt();
        scanner.nextLine();

        Person pers = new Person(lastname, firstname, age);
        pers.print();
    }
}
