package ss12_java_collection_framework.exercise.exercise_1.model;
public class Product {
    private String name;
    private double price;
    private int id;

    public Product(String name, double giaTien) {
        this.name = name;
        this.price = giaTien;
        this.id = 1;
    }

    public String getName() {
        return name;
    }

    public void  setName(String name) {
        this.name = name;
    }

    public double getGiaTien() {
        return price;
    }

    public void setGiaTien(double giaTien) {
        this.price = giaTien;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID " + getId() +
                ": Tên Sản Phẩm: " + getName() +
                ", Và Giá là " + getGiaTien()+ " VNĐ";
    }
}
