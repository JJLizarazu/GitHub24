public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        /* FIRST CONSTRUCTOR (empty Costumer)
        customer1.code = 12432101;
        customer1.name = "Elon Musk";
        customer1.phoneNumber= 65346219;
        Customer.separators();
        System.out.println(customer1.name);
        customer1.dataPrint();
        Customer.separators();
        */
        // SECOND CONSTRUCTOR (code and name Customer)
        Customer customer2 = new Customer(4380008, "Jeff Bezos");
        customer2.dataPrint();
        Customer.separators();
        // THIRD CONSTRUCTOR (code, name and phone Number Customer)
        Customer object = new Customer(801333, "Bill Gates", 70748367);
        object.dataPrint();
    }
}
