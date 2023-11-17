package pruefung;

import java.util.Scanner;

public class ErntetagPart2 {
    public static void main(String[] args) {
        int anzahlKoerbe = 0;
        String inputAmount = "";
        int[] arrKoerbe;
        int sum = 0;
        int itemsPerBucket = 0;
        int movedItems = 0;
        boolean distributionPossible = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die anzahl körbe ein: ");
        anzahlKoerbe = scanner.nextInt();
        scanner.nextLine();

        arrKoerbe = new int[anzahlKoerbe];

        System.out.print("Geben Sie die anzahl Gegenstände in jedem n-ten Korb ein: ");

        for (int i = 0; i < arrKoerbe.length; i++){
            arrKoerbe[i] = scanner.nextInt();
        }

        for(int i = 0; i < arrKoerbe.length; i++){
            sum = sum + arrKoerbe[i];
        }

        if (sum % anzahlKoerbe == 0){
            distributionPossible = true;
        }

        if (distributionPossible){
            itemsPerBucket = sum/anzahlKoerbe;

            for(int i = 0; i < arrKoerbe.length; i++){
                if(arrKoerbe[i] < itemsPerBucket){
                    movedItems = movedItems + (itemsPerBucket - arrKoerbe[i]);
                }
            }

            System.out.println(movedItems);
        }else {
            System.out.println("Das Verteilen ist nicht möglich");
        }
    }
}
