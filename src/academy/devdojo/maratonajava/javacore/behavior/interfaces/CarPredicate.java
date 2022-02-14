package academy.devdojo.maratonajava.javacore.behavior.interfaces;

import academy.devdojo.maratonajava.javacore.behavior.domain.Car;

public interface CarPredicate {
    boolean test(Car car);
}
