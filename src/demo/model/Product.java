package demo.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String brand;
    private int price;
    private String describe;

    public Product() {
    }

    public Product(int id, String name, String brand, int price, String describe) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return String.format("| %-3s | %-13s | %-13s | %-9s | %-20s |%n",getId(),getName(),getBrand(),getPrice(),getDescribe());
    }
}
