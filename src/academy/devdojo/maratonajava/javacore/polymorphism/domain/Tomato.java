package academy.devdojo.maratonajava.javacore.polymorphism.domain;

public class Tomato extends  Product{
    public static final double FEE = 0.06;
    private String expirationDate;

    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcFee() {
        System.out.println("Calculating tomato fee...");
        return this.price * FEE;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
