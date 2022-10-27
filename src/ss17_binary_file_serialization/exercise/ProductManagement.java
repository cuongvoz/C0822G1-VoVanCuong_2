package ss17_binary_file_serialization.exercise;

import java.io.*;
import java.util.Scanner;

public class ProductManagement {
    public static void main(String[] args){
        System.out.println("1. Hiển Thị Sản Phẩm");
        System.out.println("2. Thêm Sản Phẩm");
        System.out.println("3. Tìm Kiếm Sản Phẩm");
        System.out.println("4. Thoát chương trình");
        choice();
    }
    public static void choice() {
        System.out.print("Bạn Hãy Nhập Lựa Chọn tiếp Đi ạ: ");
        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
       try {
           int choice;
           do {
               choice = Integer.parseInt(scanner.nextLine());
               switch (choice) {
                   case 1:
                       productService.displayList();
                       break;
                   case 2:
                       productService.add();
                       break;
                   case 3:
                       productService.findProduct();
                       break;
                   case 4:
                       System.out.println("Thoát chương trình");
                       System.exit(0);
                   default:
                       System.out.println("hãy Nhập Lại");
               }
           } while (true);
       } catch (Exception e) {
           e.printStackTrace();
           choice();
       }

    }

}
