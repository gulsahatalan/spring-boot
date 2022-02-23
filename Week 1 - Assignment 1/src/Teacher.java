
public class Teacher<specialty> extends Person {
    private String specialty ;
    public Teacher(String firstName, String lastName, int birthday) {
        super(firstName, lastName, birthday);
    }

    public Teacher() {
        super();
    }

    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
