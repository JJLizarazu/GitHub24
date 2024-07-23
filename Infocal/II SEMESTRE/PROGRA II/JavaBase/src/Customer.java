// CODIGO
// NOMBRE COMPLETO
// TELÉFONO

public class Customer {
    int code, phoneNumber, birth;
    String name;
    // SECOND CONSTRUCTOR
    Customer(){
    }
    // SECOND CONSTRUCTOR
    Customer(int codeCostumer, String nameCostumer){
        this.code = codeCostumer;
        this.name = nameCostumer;
    }
    // THIRD CONSTRUCTOR
    Customer(int codeCostumer, String nameCostumer, int phoneNumberCostumer){
        this.code = codeCostumer;
        this.name = nameCostumer;
        this.phoneNumber = phoneNumberCostumer;
    }
    public void dataPrint(){
        System.out.println("Nombre: " + name);
        System.out.println("Código: " + code);
        System.out.println("Teléfono: " + phoneNumber);
    }
    public static void separators(){
        System.out.println("========================");
    }
}
