public class Person {
    String name; int age;
    Person(String namePerson, int agePerson){
        this.name = namePerson;
        this.age = agePerson;
    }
    /*
    public void ageVerify(){
        if (age >= 18){
            System.out.println("ES MAYOR DE EDAD");
        } else {
            System.out.println("ES MENOR DE EDAD");
        }
    }*/

    public static void ageVerify(int age){
        if (age >= 18){
            System.out.println("ES MAYOR DE EDAD");
        } else {
            System.out.println("ES MENOR DE EDAD");
        }
    }

}
