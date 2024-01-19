package examPractice;

import java.util.Arrays;

public class KlasseString {
    public static void main(String[] args) {
        //Aufgabe 1
        System.out.println(numero1("Hokuspokus"));

        //Aufgabe 2
        System.out.println(numero2("Java Programmierung", 7));

        //Aufgabe 3
        char[] charArr;
        charArr = numero3("Hokuspokus");
        for (int i = 0; i < charArr.length; i++){
            System.out.println(charArr[i]);
        }

        //Aufgabe 4
        System.out.println(numero4("Regal"));

        //Aufgabe 5
        System.out.println(numero5(""));

        //Aufgabe 6
        System.out.println(numero6("Schokoladeneis"));

        //Aufgabe 7
        System.out.println(numero7("Siebenmeilenstiefel"));

        //Aufgabe 8
        System.out.println(numero8("https://google.ch"));

        //Aufgabe 9
        System.out.println(numero9("dauer", "Brenner"));

        //Aufgabe 10
        System.out.println(numero10("Banane", "Banane"));

        //Aufgabe 11
        System.out.println(numero11("Rumpelstilzchen"));

        //Aufgabe 12
        System.out.println(numero12("Winterweihnacht"));

        //Aufgabe 14
        System.out.println(numero14("  Traubenzucker      "));

        //Aufgabe 15
        System.out.println(numero15("Drei Chinesen mit dem Kontrabass", 'i', 'o'));

        //Aufgabe 16
        System.out.println(numero16("a", "b"));

        //Aufgabe 17
        System.out.println(numero17(235));

        //Aufgabe 18
        System.out.println(numero18("Ein Semit tut`s Elli will. Ulli will es. Tut Tim es nie?"));

        //Aufgabe 19
        System.out.println(Arrays.toString(numero19("40.77.188.110")));

        //Aufgabe 20
        System.out.println(numero20("ZwiebelSchalenLassenWeinen", "zwiebelschalenlassenweinen"));
    }

    public static int numero1(String str){
        return str.length();
    }

    public static char numero2(String str, int index){
        return str.charAt(index);
    }

    public static char[] numero3(String str){
        return str.toCharArray();
    }

    public static String numero4(String str){
        String tmpString = "";

        for (int i = str.length() - 1; i >= 0; i--){
            tmpString += str.charAt(i);
        }

        return tmpString;
    }

    public static boolean numero5(String str){
        return str.isEmpty();
    }

    public static String numero6(String str){
        int halfIndex = str.length()/2;
        return str.substring(halfIndex);
    }

    public static String numero7(String str){
        return str.toUpperCase();
    }

    public static boolean numero8(String str){
        return str.endsWith(".ch");
    }

    public static String numero9(String str1, String str2){
        String tempString = "";
        tempString = str1.substring(0,1).toUpperCase();
        tempString += str1.substring(1) + str2.toLowerCase();

        return tempString;
    }

    public static boolean numero10(String str1, String str2){
        return str1.equals(str2);
    }

    public static boolean numero11(String str){
        return str.contains("st");
    }

    public static String numero12(String str){
        String positions = "";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 't'){
                positions += i + " ";
            }
        }
        return positions;
    }

    public static String numero14(String str){
        return str.trim();
    }

    public static String numero15(String str, char char1, char char2){
        return str.replace(char1, char2);
    }

    public static String numero16(String str1, String str2){
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));
        if (str1.compareTo(str2) > 0){
            return str1;
        }else{
            return str2;
        }
    }

    public static String numero17(int nr){
        return String.valueOf(nr);
    }

    public static String numero18(String str){
        String reverse = "";
        str = str.replace("`","");
        str = str.replace(".","");
        str = str.replace("?","");
        str = str.toLowerCase();

        for (int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }

        return reverse;
    }

    public static String[] numero19(String str){
        return str.split("\\.");
    }

    public static boolean numero20(String str1, String str2){
        return str1.equalsIgnoreCase(str2);
    }
}
