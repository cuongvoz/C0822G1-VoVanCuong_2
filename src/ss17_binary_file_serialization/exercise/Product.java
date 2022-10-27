package ss17_binary_file_serialization.exercise;

import java.io.Serializable;
import java.util.Random;

public class Product implements Serializable {
    private int id = ramdomID();
    private String name;
    private String brand;
    private double price;
    private String description;

    public Product() {
    }

    private int ramdomID() {
        int ranNum = 0;
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            ranNum = rand.nextInt(100) + 1;
        }
        return ranNum;
    }

    public Product(String name, String brand, double price, String description) {
        this.id = ramdomID();
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.description = description;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "ID: " + id + " ,Tên " + name + " ,Hãng: " + brand + " ,Đơn giá: " + price + " ,Miêu tả: " + description;
    }
}
