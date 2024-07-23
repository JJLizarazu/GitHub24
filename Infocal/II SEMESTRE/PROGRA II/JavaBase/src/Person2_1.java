public class Person2_1 {
    String name, lastName, dni, birthCountry;
    char gender;
    int birth;
    Person2_1(String namePerson, String lastNamePerson, String dniPerson, int birthPerson, String birthCountryPerson, char genderPerson){
        this.name = namePerson;
        this.lastName = lastNamePerson;
        this.dni = dniPerson;
        this.birth = birthPerson;
        this.birthCountry = birthCountryPerson;
        this.gender = genderPerson;
    }
    void dataprint(){
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + lastName);
        System.out.println("Carnet de Identidad: " + dni);
        System.out.println("Año de Nacimiento: " + birth);
        System.out.println("País de Nacimiento: " + birthCountry);
        System.out.println("Género: " + gender);
    }
    public static void separators(){
        System.out.println("=========================");
    }
}
