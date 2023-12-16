package w13.aufgabenKlassen_2;

public class Person {
    String lastname;
    String firstname;
    int age;

    public Person(String lastname, String firstname, int age){
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
    }

    public void print(){
        System.out.println("lastname: " + lastname);
        System.out.println("firstname: " + firstname);
        System.out.println("age: " + age);
    }
}
