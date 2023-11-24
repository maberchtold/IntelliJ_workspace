package w10;

import java.util.Scanner;

public class AufgabenMethoden_3 {
    public static void main(String[] args) {
        welcome();
    }

    public static void welcome(){
        String name = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie ihren Namen ein: ");
        name = scanner.nextLine();

        System.out.println("Herzlich willkommen "+name+"!");
    }
}
