package academy.devdojo.maratonajava.javacore.polymorphism.domain;

public class Tv extends Product{
    public static final double FEE = 0.15;
    public Tv(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcFee() {
        System.out.println("Calculating TV fee...");
        return this.price * FEE;
    }
}
