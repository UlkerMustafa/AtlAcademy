package Pradukt;

import java.util.Objects;

public class Praduct {
    private String name;
    private double price;
    private String category;
    private int ID;

    public Praduct(String name, double price, String category ,int ID) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.category = category;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Praduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", ID=" + ID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Praduct praduct = (Praduct) o;
        return Double.compare(price, praduct.price) == 0 && ID == praduct.ID && Objects.equals(name, praduct.name) && Objects.equals(category, praduct.category);
    }


}
