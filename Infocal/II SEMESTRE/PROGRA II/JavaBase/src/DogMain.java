public class DogMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.nameDog = "Wilson";
        dog1.raceDog = "Labrador";
        dog1.colorDog = "Negro";
        dog1.sizeDog = "Pequeño";
        Dog.separators();
        System.out.println("| -- NOMBRE --");
        System.out.println("|    " + dog1.nameDog);
        System.out.println("| -- RAZA --");
        System.out.println("|  " + dog1.raceDog);
        System.out.println("| -- COLOR --");
        System.out.println("|    " + dog1.colorDog);
        System.out.println("| -- TAMAÑO --");
        System.out.println("|    " + dog1.sizeDog);
        Dog.run();
        Dog.bark();
    }
}
