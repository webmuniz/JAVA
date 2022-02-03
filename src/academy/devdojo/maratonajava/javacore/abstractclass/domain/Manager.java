package academy.devdojo.maratonajava.javacore.abstractclass.domain;

public class Manager extends Employee{
    private final double bonus = 0;

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calcBonus() {
        this.salary = this.salary + this.salary * bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
