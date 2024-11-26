package Model;

public class Person {
    protected static String name;
    protected static String lastFatherName;
    protected static String lastMotherName;
    protected static String email;
    protected static String gender;
    protected static int age;

    public Person(String name, String lastFatherName, String lastMotherName, String email, String gender, int age) {
        Person.name = name;
        Person.lastFatherName = lastFatherName;
        Person.lastMotherName = lastMotherName;
        Person.email = email;
        Person.gender = gender;
        Person.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Person.name = name;
    }

    public static String getLastFatherName() {
        return lastFatherName;
    }

    public static  void setLastFatherName(String lastFatherName) {
        Person.lastFatherName = lastFatherName;
    }

    public static String getLastMotherName() {
        return lastMotherName;
    }

    public static void setLastMotherName(String lastMotherName) {
        Person.lastMotherName = lastMotherName;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Person.email = email;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        Person.gender = gender;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Person.age = age;
    }
}
