package academy.devdojo.maratonajava.javacore.concurrency.domain;

// storeName:price:discountCode
public class Discount {
    public enum Code {
        NONE(0), DISCOUNT(5), SUPER_DISCOUNT(10), MEGA_DISCOUNT(15);
        private final int percentage;

        Code(int percentage) {
            this.percentage = percentage;
        }

        public int getPercentage() {
            return percentage;
        }
    }
}
