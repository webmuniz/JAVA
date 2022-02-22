package academy.devdojo.maratonajava.javacore.polymorphism.domain;

public class Computer extends Product{
    public static final double FEE = 0.21;
    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcFee() {
        System.out.println("Calculating computer fee...");
        return this.price * FEE;
    }

}
