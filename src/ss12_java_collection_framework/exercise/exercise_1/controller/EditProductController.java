package ss12_java_collection_framework.exercise.exercise_1.controller;
import ss12_java_collection_framework.exercise.exercise_1.model.ListProduct;
import ss12_java_collection_framework.exercise.exercise_1.service.ChoiceProduct;
import java.util.Scanner;

public class EditProductController {
    public static void editProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy Nhập ID Sản Phẩm Mà Bạn Muốn Sửa : ");
        int id = Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < ListProduct.arrayList.size(); i++) {
            if (ListProduct.arrayList.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Sản Phẩm Không Tồn Tại");
            ChoiceProduct.choiceProduct();
        } else {
            System.out.println("Nhập Tên Sản Phẩm : ");
            ListProduct.arrayList.get(index).setName(scanner.nextLine());
            System.out.println("Nhập Đơn Giá : ");
            ListProduct.arrayList.get(index).setGiaTien(Double.parseDouble(scanner.nextLine()));
            System.out.println(ListProduct.arrayList.get(index).getName() + " Đã Được Update");
            ChoiceProduct.choiceProduct();
        }
    }
}
