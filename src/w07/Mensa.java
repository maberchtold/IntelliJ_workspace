package w07;

public class Mensa {
    public static void main(String[] args) {
        int antworten [] = {1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6, 10, 3, 8,
                2, 7, 5, 6, 7, 6, 8, 6, 7, 5, 6, 6, 5, 6, 7, 5, 6, 4, 8, 6, 8, 10};

        int scala [] = new int[10];

        for (int i = 0; i < antworten.length; i++){
            scala[antworten[i]-1]++;
        }

        System.out.printf("%-10s%-10s\n", "Qualität", "Anzahl");
        for (int i = 0; i < scala.length; i++){
            System.out.printf("%-10d%-10d\n", (i+1), scala[i]);
        }
    }
}
