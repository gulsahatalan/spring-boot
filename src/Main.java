import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MathTeacher mathTeacher1 = new MathTeacher("ali", "ay", 1976);
        EnglishTeacher englishTeacher1 = new EnglishTeacher("aliye", "aydin", 1980);
        System.out.println(mathTeacher1.getFullName());
        System.out.println(englishTeacher1.getFullName());

        Student student1 =new Student("ali","deniz",2002);
        Student student2 =new Student("ata","ata",2002);
        Student student3 =new Student("aslan","ece",2002);
        Student student4 =new Student("ada","deniz",2002);
        Student student5 =new Student("selma","deniz",2002);
        Student student6 =new Student("eda","-",2002);
        Student student7 =new Student("sami","deniz",2002);
        Student student8 =new Student("osman","deniz",2002);
        Student student9 =new Student("pelin","deniz",2002);
        Student student10 =new Student("mehmet","deniz",2002);
        System.out.println(student1.getFullName());

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add(student1.getFullName());
        studentList.add(student2.getFullName());
        studentList.add(student3.getFullName());
        studentList.add(student4.getFullName());
        studentList.add(student5.getFullName());
        studentList.add(student6.getFullName());
        studentList.add(student7.getFullName());
        studentList.add(student8.getFullName());
        studentList.add(student9.getFullName());
        studentList.add(student10.getFullName());

        System.out.println(studentList);
        Classroom class1= new Classroom(englishTeacher1.getFullName(), studentList,"2nd floor","english class");
        System.out.println(class1.getTeacherName()+" "+class1.getLocation()+"  "+class1.getName()+"  "+class1.getStudentList());
    }

}
