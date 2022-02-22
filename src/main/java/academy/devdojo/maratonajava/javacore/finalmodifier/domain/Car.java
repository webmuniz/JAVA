package academy.devdojo.maratonajava.javacore.finalmodifier.domain;

public class Car {
    private String model;
    public static final double LIMIT_SPEED = 250; //declarar constant Uppercase
    public final Buyer BUYER = new Buyer();

    //Ao ser final ele não poderá ser sobreescrito por qualquer subclass;
    public final void print(){
        System.out.println(this.model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
