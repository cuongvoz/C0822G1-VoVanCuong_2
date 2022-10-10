package ss4_class_and_object.practice;

import java.util.Scanner;

public class Rectangle {
    int weight, height;


    Rectangle() {
    }

    Rectangle(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    int getArea() {
        return this.weight * this.height;
    }

    int getPerimeter() {
        return (this.weight + this.height) * 2;
    }

    void display() {
        System.out.println("Hình chữ nhật có chiều cao là " + this.height + " và chiều rộng là "
                + this.weight + " và chu vi của hình chữ nhật là " + this.getPerimeter() + " và diện tích hình " +
                "chữ nhật là " + this.getArea());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number height");
        int height = scanner.nextInt();
        System.out.println("Enter number weight");
        int weight = scanner.nextInt();
        Rectangle rectangle = new Rectangle(weight, height);
        rectangle.display();

    }
}
