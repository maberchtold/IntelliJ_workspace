package w15.aufgabenReferenzen_1;

public class Person {
    private String lastname;
    private String firstname;
    private boolean married;
    private Person otherPerson;

    public Person(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.married = false;
    }

    public boolean isMarried() {
        return married;
    }

    public String getFullName(){
        return lastname + " " + firstname;
    }

    private void setMarried(Person person){
        married = true;
        otherPerson = person;
    }

    public boolean marry(Person person){
        boolean retBool = false;
        if(!married && !person.isMarried()){
            retBool = true;
            person.setMarried(this);
            setMarried(person);
        }

        return retBool;
    }

    @Override
    public String toString() {
        if (isMarried()){
            return getFullName() + " ist verheiratet mit " + otherPerson.getFullName();
        }else {
            return lastname + " " + firstname + " ist ledig.";
        }
    }
}
