import java.util.Date;

public class EnglishTeacher extends Teacher {

    private EnglishTeacher() {
        String specialty = "English";
    }

    public EnglishTeacher(String firstName, String lastName, int birthday) {
        super(firstName, lastName, birthday);
    }

}
