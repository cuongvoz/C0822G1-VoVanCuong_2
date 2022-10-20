package ss12_java_collection_framework.exercise.exercise_1.controller;
import ss12_java_collection_framework.exercise.exercise_1.service.ChoiceProduct;
import ss12_java_collection_framework.exercise.exercise_1.service.RandomIdClass;

public class ProductManager {
    public static void display() {
        RandomIdClass.getRandomId();
        System.out.println("======Menu======");
        System.out.println("1. Thêm Sản Phẩm");
        System.out.println("2. Sửa thông tin sản phẩm theo ID");
        System.out.println("3. Xoá sản phẩm theo ID");
        System.out.println("4. Hiển thị danh sách sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm theo tên");
        System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
        System.out.println("7. Thoát Chương Trình");
        ChoiceProduct.choiceProduct();
    }
}

