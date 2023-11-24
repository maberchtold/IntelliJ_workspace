package w10.AufgabenMethoden_5;

import java.util.Scanner;

public class Eisverkauf {
    static final float PRICE_KUGEL = 5.50f;
    static final float PRICE_MILKSHAKR_S = 4f;
    static final float PRICE_MILKSHAKR_M = 6f;
    static final float PRICE_MILKSHAKR_L = 8f;
    public static void eisKaufen(){
        int anzKugeln = 0;
        int anzVanille = 0;
        int anzSchokolade = 0;
        int anzErdbeere = 0;
        int userSelect = 0;
        float sumPrice = 0;
        boolean invalidInput = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie an Wie viele Kugeln eis Sie kaufen möchten: ");
        anzKugeln = scanner.nextInt();

        for (int i = 0; i < anzKugeln; i++){
            do {
                invalidInput = false;
                System.out.println();
                System.out.println("------Sorten------");
                System.out.println("1) Vanille");
                System.out.println("2) Schokolade");
                System.out.println("3) Erdbeere");
                System.out.print("Wählen Sie die "+(i+1)+". Kugel aus: ");
                userSelect = scanner.nextInt();

                switch (userSelect){
                    case 1:
                        anzVanille++;
                        break;
                    case 2:
                        anzSchokolade++;
                        break;
                    case 3:
                        anzErdbeere++;
                        break;
                    default:
                        invalidInput = true;
                        System.out.println("Bitte wählen Sie eine gükltige Sorte aus.");
                        break;
                }

            }while (invalidInput);
        }
        sumPrice = (anzVanille+anzSchokolade+anzErdbeere) * PRICE_KUGEL;
        System.out.println();
        System.out.println("Sie haben folgendes bestellt:");
        if (anzVanille > 0){
            System.out.println(anzVanille+"x Vanille");
        }
        if (anzSchokolade > 0){
            System.out.println(anzSchokolade+"x Schokolade");
        }
        if (anzErdbeere > 0){
            System.out.println(anzErdbeere+"x Erdbeere");
        }
        System.out.println("Sie müssen "+sumPrice+"CHF bezahlen");
        System.out.println();
    }

    public static void milchShakeKaufen(){
        char userInputSize = 's';
        char userInputSorte = 'v';
        float priceShake = 0f;
        boolean invalidInput = false;
        String sizeString = "";
        String sorteString = "";

        Scanner scanner = new Scanner(System.in);

        do {
            invalidInput = false;
            System.out.print("Geben Sie die Grösse des milchshakes ein (s/m/l): ");
            userInputSize = scanner.nextLine().charAt(0);
            if (userInputSize != 's' && userInputSize != 'm' && userInputSize != 'l' && userInputSize != 'S' && userInputSize != 'M' && userInputSize != 'L'){
                invalidInput = true;
            }
        }while (invalidInput);

        do {
            invalidInput = false;
            System.out.print("Geben Sie die Sorte des milchshakes ein (v -> Vanille / s -> Schokolade / e -> Erdbeere): ");
            userInputSorte = scanner.nextLine().charAt(0);
            if (userInputSorte != 'v' && userInputSorte != 's' && userInputSorte != 'e' && userInputSorte != 'V' && userInputSorte != 'S' && userInputSorte != 'E'){
                invalidInput = true;
            }
        }while (invalidInput);

        if (userInputSize == 's' || userInputSize == 'S'){
            sizeString = "kleinen";
            priceShake = PRICE_MILKSHAKR_S;
        }
        if (userInputSize == 'm' || userInputSize == 'M'){
            sizeString = "mittleren";
            priceShake = PRICE_MILKSHAKR_M;
        }
        if (userInputSize == 'l' || userInputSize == 'L'){
            sizeString = "grossen";
            priceShake = PRICE_MILKSHAKR_L;
        }

        if (userInputSorte == 'v' || userInputSorte == 'V'){
            sorteString = "Vanillemilchshake";
        }
        if (userInputSorte == 's' || userInputSorte == 'S'){
            sorteString = "Schokoladenmilchshake";
        }
        if (userInputSorte == 'e' || userInputSorte == 'E'){
            sorteString = "Erdbeermilchshake";
        }
        System.out.println();
        System.out.println("Sie haben einen "+sizeString+" "+sorteString+" für "+priceShake+"CHF bestellt.");
        System.out.println();
    }

    public static void main(String[] args) {
        boolean programRunning = true;
        int userInput = 0;

        Scanner scanner = new Scanner(System.in);

        while(programRunning){
            System.out.println("1) Eis kaufen");
            System.out.println("2) Milchshake kaufen");
            System.out.println("3) Programm beenden");
            System.out.print("Wählen Sie: ");
            userInput = scanner.nextInt();

            switch (userInput){
                case 1:
                    eisKaufen();
                    break;
                case 2:
                    milchShakeKaufen();
                    break;
                case 3:
                    programRunning = false;
                    break;
                default:
                    System.out.println("Wählen Sie einen gültigen Menüpunkt aus!");
                    break;
            }
        }
    }
}
