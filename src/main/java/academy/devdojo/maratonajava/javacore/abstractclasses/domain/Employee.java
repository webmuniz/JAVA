package academy.devdojo.maratonajava.javacore.abstractclasses.domain;

//Abstract abaixo torna essa classe como se fosse um template, não pode ser criado um objeto;
public abstract class Employee extends Person{
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calcBonus();
    }

    public abstract void calcBonus();

    @Override
    public void print() {
        System.out.println("Imprimindo...");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
