import java.util.ArrayList;

public class Classroom {
    private String teacherName;
    private ArrayList studentList;
    private String location;
    private String name;

    public Classroom(String teacherName, ArrayList studentList, String location, String name) {
        this.teacherName = teacherName;
        this.studentList = studentList;
        this.location = location;
        this.name = name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public ArrayList getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList studentList) {
        this.studentList = studentList;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
