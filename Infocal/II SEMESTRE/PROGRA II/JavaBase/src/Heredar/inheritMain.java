package Heredar;

public class inheritMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee1.setName("Pepo");
        employee2.setName("Julián");
        employee1.setSalary(2500);
        employee2.setSalary(2100);
        int Salary1 = 0, Salary2 = 0;
        Salary1 = Integer.parseInt(String.valueOf(employee1.getSalary()));
        Salary2 = Integer.parseInt(String.valueOf(employee2.getSalary()));
        System.out.println(employee1.getName());
        System.out.println(employee2.getName());
        System.out.println("Total Names: " + employee1.getName() + " " + employee2.getName());
        System.out.println("Total: " + (Salary1 + Salary2));

    }
}
