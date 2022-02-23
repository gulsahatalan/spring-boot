
public class Person {
    private String firstName;
    private String lastName;
    private int birthday;

    public Person(String firstName, String lastName, int birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public Person() {

    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
    public String getFullName() {

        return this.getFirstName()+ "  "+ this.getLastName();
    }
}
