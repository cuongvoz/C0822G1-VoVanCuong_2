package ss17_binary_file_serialization.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    public void add() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Tên Sản Phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập Hãng: ");
        String brand = scanner.nextLine();
        System.out.print("Nhập Giá (VNĐ): ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập Miêu Tả: ");
        String description = scanner.nextLine();
        FileInputStream fileInputStream = new FileInputStream("src\\ss17_binary_file_serialization\\exercise\\product.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Product> productList = (List<Product>) objectInputStream.readObject();
        FileOutputStream fileOutputStream = new FileOutputStream("src\\ss17_binary_file_serialization\\exercise\\product.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        productList.add(new Product(name, brand, price, description));
        System.out.println("Sản phẩm " + name + " đã được thêm");
        objectOutputStream.writeObject(productList);
        objectInputStream.close();
        ProductManagement.choice();
    }

    public void displayList() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src\\ss17_binary_file_serialization\\exercise\\product.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Product> productList = (List<Product>) objectInputStream.readObject();
        for (Product product : productList) {
            System.out.println(product);
        }
        objectInputStream.close();
        ProductManagement.choice();
    }

    public void findProduct() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm bạn muốn tìm: ");
        String name = scanner.nextLine();
        FileInputStream fileInputStream = new FileInputStream("src\\ss17_binary_file_serialization\\exercise\\product.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Product> productList = (List<Product>) objectInputStream.readObject();
        boolean check = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                System.out.println(productList.get(i));
                check = true;
            }
        }
        if (!check) {
            System.out.println("Sản Phẩm Không Tồn Tại");
        }
        ProductManagement.choice();
    }
}
