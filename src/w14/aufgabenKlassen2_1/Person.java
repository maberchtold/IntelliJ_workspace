package w14.aufgabenKlassen2_1;

public class Person {
    private String nachname;
    private String vorname;
    private int alter;
    private char familienstand;
    private int anzKinder;

    public Person(String nachname, String vorname) {
        this.nachname = nachname;
        this.vorname = vorname;
    }

    public Person(String nachname, String vorname, int alter, char familienstand, int anzKinder) {
        this.nachname = nachname;
        this.vorname = vorname;
        setAlter(alter);
        setFamilienstand(familienstand);
        setAnzKinder(anzKinder);
    }

    public int getAlter() {
        return alter;
    }

    public char getFamilienstand() {
        return familienstand;
    }

    public int getAnzKinder() {
        return anzKinder;
    }

    public void setAlter(int alter) {
        if (alter >= 0){
            this.alter = alter;
        }else{
            System.out.println("es wurde ein ungültiges alter übergeben");
        }
    }

    public void setFamilienstand(char familienstand) {
        if (alter < 16){
            switch (familienstand){
                case 'l':
                case 'L':
                    this.familienstand = familienstand;
                    break;
                default:
                    System.out.println("Ein ungültiger familienstand wurde übergeben");
                    break;
            }
        }else {
            switch (familienstand){
                case 'l':
                case 'L':
                case 'v':
                case 'V':
                case 'w':
                case 'W':
                case 'g':
                case 'G':
                    this.familienstand = familienstand;
                    break;
                default:
                    System.out.println("Ein ungültiger familienstand wurde übergeben");
                    break;
            }
        }

    }

    public void setAnzKinder(int anzKinder) {
        if (anzKinder >= 0){
            this.anzKinder = anzKinder;
        }else{
            System.out.println("es wurde eine ungültige anzahl Kinder übergeben");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "nachname='" + nachname + '\'' +
                ", vorname='" + vorname + '\'' +
                ", alter=" + alter +
                ", familienstand=" + familienstand +
                ", anzKinder=" + anzKinder +
                '}';
    }
}
