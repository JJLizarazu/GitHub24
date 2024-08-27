package Heredar;

public class Employee extends Person{
    String idEmployee; int Salary;

    public Employee() {
    }

    public Employee(String name, String lastName, String ID, int age, String idEmployee, int salary) {
        super(name, lastName, ID, age);
        this.idEmployee = idEmployee;
        Salary = salary;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
