public class Person2_1Main {
    public static void main(String[] args) {
        Person2_1 person1 = new Person2_1("Elon", "Musk", "12432101", 1998, "Australia", 'H');
        Person2_1 person2 = new Person2_1("Jeff", "Bezos", "13420394", 1990, "USA", 'H');
        Person2_1.separators();
        person1.dataprint();
        Person2_1.separators();
        person2.dataprint();
        Person2_1.separators();
    }
}
