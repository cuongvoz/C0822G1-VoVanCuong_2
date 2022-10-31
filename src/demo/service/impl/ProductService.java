package demo.service.impl;

import demo.controller.ProductManagement;
import demo.model.Product;
import demo.service.IProductService;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    ProductManagement productManagement = new ProductManagement();

    public static List<Product> readFile() throws IOException, ClassNotFoundException {
        String path = "src\\demo\\data\\demo.txt";
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Product> list = (List<Product>) objectInputStream.readObject();
        objectInputStream.close();
        return list;

    }

    public static void writeFile(List<Product> products) throws IOException {
        String path = "src\\demo\\data\\demo.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(products);
        objectOutputStream.close();
    }

    @Override
    public void add() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID học sinh mới: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập Tỉnh: ");
        String brand = scanner.nextLine();
        System.out.print("Nhập Năm Sinh: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập mô tả: ");
        String describle = scanner.nextLine();
        List<Product> products = readFile();
        products.add(new Product(id, name, brand, price, describle));
        writeFile(products);
        System.out.println("Học sinh " + name + " đã được thêm vào danh sách");
        System.out.print("Hãy nhập lựa chọn tiếp theo: ");
        productManagement.choice();
    }

    @Override
    public void find() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên học sinh bạn muốn tìm: ");
        String namez = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < readFile().size(); i++) {
            if (readFile().get(i).getName().equals(namez)) {
                check = true;
            }
        }
        if (!check) {
            System.out.print("Học sinh " + namez + " không tồn tại hoặc nhập sai tên: ");
            find();
        } else {
            System.out.printf("--------------------------------------------------------------------------%n");
            System.out.printf("| %-3s | %-13s | %-13s | %-9s | %-20s |%n", "ID", "Họ Tên", "Địa Chỉ", "Năm Sinh", "Mô Tả");
            System.out.printf("--------------------------------------------------------------------------%n");
            for (int i = 0; i < readFile().size(); i++) {
                if (readFile().get(i).getName().equals(namez)) {
                    System.out.print(readFile().get(i));
                }
            }
            System.out.printf("--------------------------------------------------------------------------%n");
        }
        System.out.print("Hãy nhập lựa chọn tiếp theo: ");
        productManagement.choice();

    }

    @Override
    public void delete() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID học sinh bạn muốn xóa: ");
        int idz = Integer.parseInt(scanner.nextLine());
        int index = 0;
        boolean check = false;
        for (int i = 0; i < readFile().size(); i++) {
            if (readFile().get(i).getId() == idz) {
                check = true;
                index = i;
            }
        }
        if (!check) {
            System.out.print("Học sinh bạn nhập không tồn tại hoặc nhập sai id: ");
            delete();
        } else {
            String namez = readFile().get(index).getName();
            List<Product> products = readFile();
            products.remove(index);
            writeFile(products);
            System.out.println("Học sinh " + namez + " đã được xóa khỏi danh sách");
            System.out.print("Hãy nhập lựa chọn tiếp theo: ");
            productManagement.choice();
        }

    }

    @Override
    public void edit() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID học sinh bạn muốn sửa: ");
        int idz = Integer.parseInt(scanner.nextLine());
        int index = 0;
        boolean check = false;
        for (int i = 0; i < readFile().size(); i++) {
            if (readFile().get(i).getId() == idz) {
                check = true;
                index = i;
            }
        }
        if (!check) {
            System.out.println("Học sinh bạn nhập không tồn tại hoặc nhập sai id... ");
            edit();
        } else {
            System.out.println("Tiến hành các bước sửa thông tin học sinh " + readFile().get(index).getName());
            System.out.print("Nhập ID học sinh mới: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập tên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập tỉnh: ");
            String brand = scanner.nextLine();
            System.out.print("Nhập năm sinh: ");
            int price = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập mô tả: ");
            String describle = scanner.nextLine();
            List<Product> products = readFile();
            products.get(index).setId(id);
            products.get(index).setName(name);
            products.get(index).setBrand(brand);
            products.get(index).setPrice(price);
            products.get(index).setDescribe(describle);
            writeFile(products);
            System.out.println("Học sinh " + name + " đã được thêm vào danh sách");
            System.out.print("Hãy nhập lựa chọn tiếp theo: ");
            productManagement.choice();
        }


    }

    @Override
    public void display() throws IOException, ClassNotFoundException {
        System.out.printf("--------------------------------------------------------------------------%n");
        System.out.printf("| %-3s | %-13s | %-13s | %-9s | %-20s |%n", "ID", "Họ Tên", "Địa Chỉ", "Năm Sinh", "Mô Tả");
        System.out.printf("--------------------------------------------------------------------------%n");
        for (Product product : readFile()) {
            System.out.print(product);
        }
        System.out.printf("--------------------------------------------------------------------------%n");
        System.out.print("Hãy nhập lựa chọn tiếp theo: ");
        productManagement.choice();
    }
}
