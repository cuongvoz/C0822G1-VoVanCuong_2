package demo.controller;

import demo.service.impl.ProductService;

import java.io.IOException;
import java.util.Scanner;

public class ProductManagement {
    public void display() throws IOException, ClassNotFoundException {
        System.out.println("------------Menu-----------\n"
                + "| 1. | Hiển thị danh sách |\n" + "| 2. | Thêm học sinh      |\n"
                + "| 3. | Sửa thông tin      |\n" + "| 4. | Tìm kiếm học sinh  |\n" +
                "| 5. | Xóa học sinh       |\n" + "| 6. | Thoát menu         |\n" +
                "---------------------------");
        System.out.print("Hãy nhập lựa chọn của bạn: ");
        choice();
    }

    public void choice() throws IOException, ClassNotFoundException {
        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productService.display();
                    break;
                case 2:
                    productService.add();
                    break;
                case 3:
                    productService.edit();
                    break;
                case 4:
                    productService.find();
                    break;
                case 5:
                    productService.delete();
                    break;
                case 6:
                    System.out.println("---------------------------\n" +
                            "|  Kết thúc chương trình  |\n" +
                            "|       Hẹn Gặp Lại       |\n" +
                            "---------------------------");
                    System.exit(0);
                default:
                    System.out.print("Vui lòng nhập lại từ [1-6]: ");
            }

        } while (choice < 1 || choice > 6);
    }

}
