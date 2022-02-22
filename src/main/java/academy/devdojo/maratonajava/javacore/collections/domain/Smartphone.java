package academy.devdojo.maratonajava.javacore.collections.domain;

public class Smartphone {
    private String serialNumber;
    private String brand;

    public Smartphone(String serialNumber, String brand) {
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

    //Reflexive: x.equals(x) must be true, for everything other than null
    //Simetric: for x and y not null, if x.equals(y) == true; then y.equals(x) == true;
    //Transitivity: for x,y,z not null, if x.equals(y) == true; and x.equals(z) == true; then y.equals(z) == true
    //Consistent: x.equals(x) always return true if x not null
    //To x not null, x.equals(null) needs to return false.
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;

        Smartphone smartphone = (Smartphone) obj;
        return serialNumber !=null && serialNumber.equals(smartphone.serialNumber);
    }

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
