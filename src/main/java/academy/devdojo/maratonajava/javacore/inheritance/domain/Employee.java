package academy.devdojo.maratonajava.javacore.inheritance.domain;

public class Employee extends Person {

    private double salary;

    public Employee(String name) {
        super(name);
    }

    public void print(){
//        super.print(); Carrega o método print da classe herdada ( Person )
        System.out.println("========= EMPLOYEE ==========");
        System.out.println("Name: " + super.getName());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Address: " + super.getAddress().getStreet() + " | CEP: " + super.getAddress().getZipCode());
        System.out.println("Salary: " + this.salary);
    }

    public void paymentReport(){
        System.out.println("Eu "+ this.name + " recebi o valor de R$" + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
