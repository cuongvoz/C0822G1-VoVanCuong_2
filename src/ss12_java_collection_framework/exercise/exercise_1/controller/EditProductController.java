package ss12_java_collection_framework.exercise.exercise_1.controller;
import ss12_java_collection_framework.exercise.exercise_1.model.ListProduct;
import ss12_java_collection_framework.exercise.exercise_1.model.Product;
import ss12_java_collection_framework.exercise.exercise_1.service.ChoiceProduct;

import java.util.Scanner;

public class EditProductController {
    public static void editProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy Nhập ID Sản Phẩm Mà Bạn Muốn Sửa : ");
        int id = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < ListProduct.arrayList.size(); i++) {
            if (ListProduct.arrayList.get(i).getId() == id) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("Sản Phẩm Không Tồn Tại");
            ChoiceProduct.choiceProduct();
        } else {
            System.out.print("Nhập Tên Sản Phẩm : ");
            String name = scanner.nextLine();
            System.out.print("Nhập Đơn Giá : ");
            double price = scanner.nextDouble();
            ListProduct.arrayList.set(index, new Product(name, price));
            System.out.println(ListProduct.arrayList.get(index).getName() + " Đã Được Update");
            ChoiceProduct.choiceProduct();
        }
    }
}
