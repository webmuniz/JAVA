package academy.devdojo.maratonajava.javacore.enumeration.domain;

public enum TypePayment {
    DEBIT {
        @Override
        public double calcDiscount(double value) {
            return value * 0.1;
        }
    },
    CREDIT {
        @Override
        public double calcDiscount(double value) {
            return value * 0.05;
        }
    };

    //Método abstrato não tem corpo, ele foi criado para ser sobrescrito;
    public abstract double calcDiscount(double value);
}