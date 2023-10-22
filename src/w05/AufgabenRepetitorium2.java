package w05;

import java.util.Scanner;

public class AufgabenRepetitorium2 {
    public static void main(String[] args) {
        boolean exitProgram = false;
        boolean exitTitlePageMenu = false;
        boolean exitCategoryMenu = false;
        String category = "nicht bekannt";
        String newspaperName = "";
        String newspaperDate = "";
        String headline = "";
        String titleArticle1 = "nicht bekannt";
        String textArticle1 = "nicht bekannt";
        String titleArticle2 = "nicht bekannt";
        String textArticle2 = "nicht bekannt";
        int mainMenuInput = 0;
        int titlePageMenuInput = 0;
        int categoryMenuInput = 0;
        int deleteArticleMenuInput = 0;


        Scanner scanner = new Scanner(System.in);

        while(!exitProgram){
            System.out.println("(1) Titelblatt bearbeiten");
            System.out.println("(2) "+category+" bearbeiten");
            System.out.println("(3) Zeitung drucken");
            System.out.println("(4) Programm beenden");
            System.out.print("Bitte wählen Sie: ");
            mainMenuInput = scanner.nextInt();
            scanner.nextLine();

            switch (mainMenuInput) {
                case 1:
                    while(!exitTitlePageMenu) {
                        System.out.println("(1) Name der Zeitung und Datum eingeben");
                        System.out.println("(2) Headline eingeben");
                        System.out.println("(3) Headline, Name und Datum löschen");
                        System.out.println("(4) Zurück");
                        System.out.print("Bitte wählen Sie: ");

                        titlePageMenuInput = scanner.nextInt();
                        scanner.nextLine();

                        switch (titlePageMenuInput) {
                            case 1:
                                System.out.print("Geben Sie den Namen der Zeitung ein: ");
                                newspaperName = scanner.nextLine();
                                System.out.print("Geben Sie das Datum der Ausgabe ein: ");
                                newspaperDate = scanner.nextLine();
                                break;
                            case 2:
                                System.out.print("Geben Sie die Headline für den Tag ein: ");
                                headline = scanner.nextLine();
                                break;
                            case 3:
                                newspaperName = "";
                                newspaperDate = "";
                                headline = "";
                                break;
                            case 4:
                                exitTitlePageMenu = true;
                                break;
                            default:
                                break;
                        }
                    }
                    exitTitlePageMenu = false;
                    break;
                case 2:
                    while (!exitCategoryMenu){
                        System.out.println("(1) Name für Rubrik eingeben");
                        System.out.println("(2) Titel und Artikel 1 eingeben");
                        System.out.println("(3) Titel und Artikel 2 eingeben");
                        System.out.println("(4) Titel und Artikel löschen");
                        System.out.println("(5) Zurück");
                        System.out.print("Bitte wählen Sie: ");

                        categoryMenuInput = scanner.nextInt();
                        scanner.nextLine();

                        switch (categoryMenuInput){
                            case 1:
                                System.out.print("Bitte geben Sie die Rubrik für Seite 2 an: ");
                                category = scanner.nextLine();
                                break;
                            case 2:
                                System.out.print("Bitte geben Sie den Titel des Artikels 1 in Rubrik "+category+" an: ");
                                titleArticle1 = scanner.nextLine();
                                System.out.print("Bitte geben Sie den Inhalt des Artikels 1 in Rubrik "+category+" an: ");
                                textArticle1 = scanner.nextLine();
                                break;
                            case 3:
                                System.out.print("Bitte geben Sie den Titel des Artikels 1 in Rubrik "+category+" an: ");
                                titleArticle2 = scanner.nextLine();
                                System.out.print("Bitte geben Sie den Inhalt des Artikels 1 in Rubrik "+category+" an: ");
                                textArticle2 = scanner.nextLine();
                                break;
                            case 4:
                                System.out.println("Welchen Titel und Artikel der Rubrik "+category+" soll gelöscht werden?");
                                System.out.println("1: "+titleArticle1);
                                System.out.println("2: "+titleArticle2);

                                deleteArticleMenuInput = scanner.nextInt();
                                scanner.nextLine();

                                if(deleteArticleMenuInput == 1){
                                    titleArticle1 = "nicht bekannt";
                                    textArticle1 = "nicht bekannt";
                                    System.out.println("Daten wurden gelöscht.");
                                } else if (deleteArticleMenuInput == 2) {
                                    titleArticle2 = "nicht bekannt";
                                    textArticle2 = "nicht bekannt";
                                    System.out.println("Daten wurden gelöscht.");
                                }
                                break;
                            case 5:
                                exitCategoryMenu = true;
                                break;
                            default:
                                break;
                        }
                    }
                    exitCategoryMenu = false;
                    break;
                case 3:
                    System.out.println("===========================================================================");
                    System.out.println("--------Page1--------");
                    System.out.println(newspaperName);
                    System.out.println(newspaperDate);
                    System.out.println(headline);
                    System.out.println("---------------------");
                    System.out.println("--------Page2--------");
                    System.out.println("Rubrik: "+category);
                    System.out.println();
                    System.out.println(titleArticle1);
                    System.out.println(textArticle1);
                    System.out.println();
                    System.out.println(titleArticle2);
                    System.out.println(textArticle2);
                    System.out.println("---------------------");
                    System.out.println("===========================================================================");
                    break;
                case 4:
                    exitProgram = true;
                    break;
                default:
                    break;
            }
        }
    }
}
