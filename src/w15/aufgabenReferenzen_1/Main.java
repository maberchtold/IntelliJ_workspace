package w15.aufgabenReferenzen_1;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Guschtaf", "Guschti");
        Person p2 = new Person("Eggel","Lara");
        Person p3 = new Person("Coolbrenner", "David");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        System.out.println("Marry:");
        System.out.println(p1.marry(p2));


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println("Is married:");
        System.out.println(p1.isMarried());
        System.out.println(p2.isMarried());
        System.out.println(p3.isMarried());
    }
}
