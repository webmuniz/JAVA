package academy.devdojo.maratonajava.javacore.collections.domain;

import java.util.Objects;

public class Manga  implements Comparable<Manga>{
    private Long id;
    private String name;
    private double price;

    public Manga(Long id, String name, double price) {
        Objects.requireNonNull(id, "Id field cannot be null");
        Objects.requireNonNull(name, "name field cannot be null");
        Objects.requireNonNull(price, "price field cannot be null");
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id == manga.id && Double.compare(manga.price, price) == 0 && name.equals(manga.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    //if this < o return -1
    //if this == o return 0
    //if this > o return 1
    public int compareTo(Manga o) {
        //        if(this.id < o.getId()){
//            return -1;
//        }else if (this.id == o.getId()){
//            return 0;
//        }else {
//            return 1;
//        }

        //need to be wrapper!!!

        //sort by id:
        //return this.id.compareTo(o.getId());

        //sort by price:
        //return Double.compare(price, o.getPrice());

        //sort by name:
        return this.name.compareTo(o.getName());
    }
}
