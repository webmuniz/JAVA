package academy.devdojo.maratonajava.javacore.generics.domain;

public class Boat {
    private String model;

    public Boat(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "model='" + model + '\'' +
                '}';
    }
}
