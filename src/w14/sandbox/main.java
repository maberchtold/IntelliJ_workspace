package w14.sandbox;
public class main {
    public static void main(String[] args) {
        Person[] persArr = Person.getPersonArray();

        for (int i = 0; i < persArr.length; i++){
            System.out.println(persArr[i]);
        }
    }
}
