package w14.aufgabenKlassen2_1;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Berchtold", "Matteo", 21, 'l', 0);

        p1.setFamilienstand('v');
        System.out.println(p1);
    }
}
