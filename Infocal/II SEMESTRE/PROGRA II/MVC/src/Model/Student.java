package Model;

public class Student extends Person {
    protected static int grade;

    public Student(String nameStudent, String lastFatherName, String lastMotherName, String email, String gender, int age, int grade) {
        super(nameStudent, lastFatherName, lastMotherName, email, gender, age);
        Student.grade = grade;
    }

    public static int getGrade() {
        return grade;
    }

    public static void setGrade(int grade) {
        Student.grade = grade;
    }
}
