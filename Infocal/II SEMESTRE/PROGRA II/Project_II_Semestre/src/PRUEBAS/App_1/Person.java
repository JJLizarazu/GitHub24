package PRUEBAS.App_1;

public class Person {
    protected static String name;
    protected static String lastFatherName;
    protected static String lastMotherName;
    protected static int age = 0;
    protected static String gender;

    public Person(String name, String lastFatherName, String lastMotherName, int age, String gender) {
        Person.name = name;
        Person.lastFatherName = lastFatherName;
        Person.lastMotherName = lastMotherName;
        Person.age = age;
        Person.gender = gender;
    }

}
