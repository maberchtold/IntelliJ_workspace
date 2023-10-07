package w03;

import java.util.Locale;
import java.util.Scanner;

public class wardrobeCalculator {
    public static void main(String[] args) {
        float wardrobeWidth;
        float wardrobeHeight;
        float wardrobeDepth;
        float wardrobeSide1;
        float wardrobeSide2;
        float wardrobeSide3;
        float wardrobeSurfaceArea;
        float wardrobeVolume;
        boolean wardrobeFits = true;

        float doorWidth;
        float doorHeight;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter the wardrobe width in cm: ");
        wardrobeWidth = scanner.nextFloat();

        System.out.print("Enter the wardrobe height in cm: ");
        wardrobeHeight = scanner.nextFloat();

        System.out.print("Enter the wardrobe depth in cm: ");
        wardrobeDepth = scanner.nextFloat();

        System.out.print("Enter the door width in cm: ");
        doorWidth = scanner.nextFloat();

        System.out.print("Enter the door height in cm: ");
        doorHeight = scanner.nextFloat();

        wardrobeSide1 = wardrobeWidth * wardrobeHeight;
        wardrobeSide2 = wardrobeWidth * wardrobeDepth;
        wardrobeSide3 = wardrobeHeight * wardrobeDepth;

        wardrobeSurfaceArea = 2*(wardrobeSide1+wardrobeSide2+wardrobeSide3);
        wardrobeVolume = wardrobeWidth * wardrobeHeight * wardrobeDepth;

        System.out.println("The wardrobe surface area is "+wardrobeSurfaceArea+"cm²");
        System.out.println("The wardrobe volume is "+wardrobeVolume+"cm³");

        if ((wardrobeWidth >= doorWidth || wardrobeHeight >= doorHeight) || (wardrobeHeight >= doorWidth || wardrobeWidth >= doorHeight)){
            wardrobeFits = false;
        }
        if ((wardrobeWidth >= doorWidth || wardrobeDepth >= doorHeight) || (wardrobeDepth >= doorWidth || wardrobeWidth >= doorHeight)){
            wardrobeFits = false;
        }
        if ((wardrobeHeight >= doorWidth || wardrobeDepth >= doorHeight) || (wardrobeDepth >= doorWidth || wardrobeHeight >= doorHeight)){
            wardrobeFits = false;
        }

        if (wardrobeFits){
            System.out.println("The wardrobe fits through the door");
        }else {
            System.out.println("The wardrobe does not fit through the door");
        }
    }
}
