package ss12_java_collection_framework.exercise.exercise_1.controller;
import ss12_java_collection_framework.exercise.exercise_1.model.ListProduct;
import ss12_java_collection_framework.exercise.exercise_1.model.Product;
import ss12_java_collection_framework.exercise.exercise_1.service.ChoiceProduct;

import java.util.Scanner;

public class AddProductController {
    public static void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Tên Sản Phẩm : ");
        String name = scanner.nextLine();
        System.out.print("Nhập Giá Cả : ");
        int price = scanner.nextInt();
        int id = ListProduct.arrayList.get(ListProduct.arrayList.size() - 1).getId() + 1;
        Product p = new Product(name, price);
        p.setId(id);
        ListProduct.arrayList.add(p);
        System.out.println("Sản Phẩm " + name + " Đã Được thêm vào danh sách");
        ChoiceProduct.choiceProduct();
    }
}
