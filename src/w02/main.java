package w02;

public class main {
    public static void main(String[] args) {
        // switch variable values
        //switchVariableValues();

        //calculate averageMark
        calculateAverageMark();

        //convert decimal to binary
        //convertDecimalToBinary(500);
    }

    static void switchVariableValues() {

        int a = 5;
        int b = 10;
        int c;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    static void calculateAverageMark(){
        float noteE = 5.5f;
        float noteT1 = 4.5f;
        float noteT2 = 6.0f;
        float notePa1 = 6.0f;
        float notePa2 = 6.0f;
        float notePa3 = 6.0f;
        float durchschnitt;
        float durchnittPa;

        durchnittPa = ((notePa1 + notePa2 + notePa3) / 3 );

        noteT2 = ((3*noteT2) + durchnittPa ) / 4;

        durchschnitt = (noteE * 2 + noteT1 + noteT2) / 4;


        System.out.println("The average mark is: "+durchschnitt);
    }
    static void convertDecimalToBinary(int number) {
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
