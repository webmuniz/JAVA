package academy.devdojo.maratonajava.javacore.abstractclasses.domain;

public class Developer extends Employee{
    private final double bonus = 0.05;

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calcBonus() {
        this.salary = this.salary + this.salary * bonus;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
