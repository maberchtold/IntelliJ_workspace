package w04;

public class AufgabenSchleifen2_3 {
    public static void main(String[] args) {
        int number = 666;
        int initalNumber = number;
        String binaryString = "";
        int remainder;

        while (number > 0) {
            remainder = number % 2;
            binaryString = remainder + binaryString;
            number = number / 2;
        }

        System.out.println(initalNumber + " in binary is: " + binaryString);
    }
}
