package w11_StringKlasse;

public class AufgabenString_1 {
    public static void main(String[] args) {
        //Aufgabe 1
        System.out.println("Aufgabe 1:");
        String strVal = "Hokuspokus";
        int charCount = 0;
        charCount = countChars(strVal);
        System.out.println(charCount);

        //Aufgabe 2
        System.out.println("Aufgabe 2:");
        String strVal2 = "Java Programmierung";
        char retChar;
        System.out.println(getCharAt(strVal2,7));

        //Aufgabe 3
        System.out.println("Aufgebe 3:");
        String strVal3 = "Hokuspokus";
        char[] retArr = convertToArr(strVal3);
        for (int i = 0; i < retArr.length; i++){
            System.out.println(retArr[i]);
        }

        //Aufgabe 4
        System.out.println("Aufgabe 4:");
        String strVal4 = "Regal";
        String turnedStr = "";
        turnedStr = turnStr(strVal4);
        System.out.println(turnedStr);

        //Aufgabe 5
        System.out.println("Aufgabe 5:");
        String strVal5 = "";
        boolean retBool;
        retBool = hasContent(strVal5);
        System.out.println(retBool);

        //Aufgabe 6
        System.out.println("Aufgabe 6:");
        String strVal6 = "Schokoladeneis";
        String subStr = "";
        subStr = getSubStr(strVal6);
        System.out.println(subStr);

        //Aufgabe 7
        System.out.println("Aufgabe 7:");
        String strVal7 = "Siebenmailenstiefel";
        System.out.println(makeBig(strVal7));

        //Aufgabe 8
        System.out.println("Aufgabe 8:");
        String strVal8 = "http://googl.ch";
        System.out.println(checkSwissLink(strVal8));

        //Aufgabe 9
        System.out.println("Aufgabe 9:");
        String strVal9_a = "Dauer";
        String strVal9_b = "Brenner";
        System.out.println(combineWords(strVal9_a, strVal9_b));

        //Aufgabe 10
        System.out.println("Aufgabe 10:");
        String strVal10_a = "Banane";
        String strVal10_b = "Banane";
        System.out.println(compareStrings(strVal10_a, strVal10_b));

        //Aufgabe 11
        System.out.println("Aufgabe 11:");
        String strVal11 = "Rumpelstilzchen";
        System.out.println(containsSt(strVal11));

        //Aufgabe 12
        System.out.println("Aufgabe 12:");
        String stringVal12 = "Winterweihnacht";
        System.out.println(getCharIndex(stringVal12, 't'));

        //Aufgabe 13
        System.out.println("Aufgabe 13:");
        String strVal13 = "Das Arbeiten mit Strings ist nicht einfach";
        System.out.println(countSpecificChars(strVal13, 'e'));

        //Aufgabe 14
        System.out.println("Aufgabe 14:");
        String strVal14 = "    Traubenzucker      ";
        System.out.println(removeSpaces(strVal14));

        //Aufgabe 15
        System.out.println("Aufgabe 15:");
        String strVal15 = "Dri Chinisin mit dim Kintribiss";
        System.out.println(chingChong(strVal15));

        //Aufgabe 16
        System.out.println("Aufgabe 16:");
        String strVal16_a = "Kiwi";
        String strVal16_b = "Kartoffel";
        System.out.println(compareWordsAlphabetical(strVal16_a, strVal16_b) + " is first in the Alphabet");

        //Aufgabe 17
        System.out.println("Aufgabe 17:");
        int intVal17 = 235;
        System.out.println(convertToString(intVal17));

        //Aufgabe 18
        System.out.println("Aufgabe 18:");
        String strVal18 = "Ein Semit tut's Elli will. Ulli will es. Tut Tim es nie?";
        System.out.println(checkIfPalindrom(strVal18));

        //Aufgabe 19
        System.out.println("Aufgabe 19:");
        String[] retArr19;
        String strVal19 = "40.77.188.110";
        retArr19 = splitIp(strVal19);
        System.out.println(retArr19[0]);
        System.out.println(retArr19[1]);
        System.out.println(retArr19[2]);
        System.out.println(retArr19[3]);

        //Aufgabe 20
        System.out.println("Aufgabe 20:");
        String strVal20_a = "ZwiebelSchalenLassenWeinen";
        String strVal20_b = "zwiebelschalenlassenweinen";
        System.out.println(compareStringsNoCase(strVal20_a, strVal20_b));

        //Aufgabe 21
        System.out.println("Aufgabe 21:");
        String strVal21 = "ZwiebelSchalenLassenWeinen";
        System.out.println(getCharsBetween(strVal21,'Z','S'));
    }

    public static int countChars(String str){
        return str.length();
    }

    public static char getCharAt(String str, int charPos){
        return str.charAt(charPos-1);
    }

    public static char[] convertToArr(String str){
        return str.toCharArray();
    }

    public static String turnStr(String str){
        StringBuilder retStr = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--){
            retStr.append(str.charAt(i));
        }

        return retStr.toString();
    }

    public static boolean hasContent(String str){
        return str.isEmpty();
    }

    public static String getSubStr(String str){
        String retStr;
        int subLength = str.length() / 2;
        retStr = str.substring(subLength);
        return retStr;
    }

    public static String makeBig(String str){
        return str.toUpperCase();
    }

    public static boolean checkSwissLink(String str){
        return str.endsWith(".ch");
    }

    public static String combineWords(String str1, String str2){
        return str1.concat(str2.toLowerCase());
    }

    public static boolean compareStrings(String str1, String str2){
        return str1.equals(str2);
    }

    public static boolean containsSt(String str){
        return str.contains("st");
    }

    public static String getCharIndex(String str, char search){
        String positions = "";
        int pos = 0;
        while (pos < str.length()){
            pos = str.indexOf(search,pos);
            if (pos != -1){
                positions += pos;
                positions += " ";
                pos++;
            }else {
                break;
            }
        }
        return positions;
    }

    public static int countSpecificChars(String str, char character){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == character){
                count++;
            }
        }
        return count;
    }

    public static String removeSpaces(String str){
        return str.trim();
    }

    public static String chingChong(String str){
        return  str.replace('i','o');
    }

    public static String compareWordsAlphabetical(String str1, String str2){
        if (str1.compareTo(str2) < 0){
            return str1;
        }else{
            return str2;
        }
    }

    public static String convertToString(int number){
        return String.valueOf(number);
    }

    public static boolean checkIfPalindrom(String str){
        String reversed = "";
        str = str.replace("'","");
        str = str.replace(" ","");
        str = str.replace(".","");
        str = str.replace("?","");
        str = str.toLowerCase();

        for (int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }

        if (str.equals(reversed)){
            return true;
        }else{
            return false;
        }
    }

    public static String[] splitIp(String str){
        return str.split("\\.");
    }

    public static boolean compareStringsNoCase(String str1, String str2){
        return str1.equalsIgnoreCase(str2);
    }

    public static String getCharsBetween(String str, char character1, char character2){
        int index1 = str.indexOf(character1);
        int index2 = str.indexOf(character2);

        return str.substring(index1,index2);
    }
}
