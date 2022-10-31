package case_study.mvc.service.impl;

import case_study.mvc.model.Customer;
import case_study.mvc.service.ICustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    static List<Customer> customers = new LinkedList<>();

    static {
        Customer customer1 = new Customer("11/5/1993", "Nguyễn Văn D", "Nam", "32131245", "dsadmi32@gmail.com", "454999", 1, "Diamond", "Gia Lai");
        Customer customer2 = new Customer("2/1/1994", "Nguyễn Văn F", "Nam", "47453733", "dsauhdy@gmail.com", "6754834", 2, "Platinium", "Đà Nẵng");
        Customer customer3 = new Customer("23/3/1993", "Nguyễn Văn G", "Nam", "89574273", "ddsaxz2@gmail.com", "452534", 3, "Gold", "Đà Nẵng");
        Customer customer4 = new Customer("6/6/1995", "Nguyễn Văn H", "Nam", "483765965", "48327jh@gmail.com", "5116234", 4, "Silver", "Gia Lai");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
    }

    @Override
    public void display() {
        for (Customer x : customers) {
            System.out.println(x);
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Ngày Sinh");
        String dateBirth = scanner.nextLine();
        System.out.println("Nhập Tên");
        String name = scanner.nextLine();
        System.out.println("Nhập Giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập Số CMND");
        String cmnd = scanner.nextLine();
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Nhập Số Điện thoại");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập Mã Khách Hàng");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Kiểu Khách");
        String typeGuest = scanner.nextLine();
        System.out.println("Nhập Địa Chỉ");
        String address = scanner.nextLine();
        Customer customer = new Customer(dateBirth,name,gender,cmnd,email,phoneNumber,id,typeGuest,address);
        customers.add(customer);
        System.out.println("Đã thêm " + name + " vào danh sách khách hàng");
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Mã Khách Hàng Bạn Muốn Sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int index = 0;
        boolean check = false;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCustomerCode() == id) {
                index = i;
                check = true;
            }
        }
        if (!check) {
            System.out.println("Bạn nhập sai mã khách hàng hoặc mã nhân viên không tồn tại: ");
            edit();
        } else {
            System.out.println("Nhập Ngày Sinh");
            String dateBirth = scanner.nextLine();
            System.out.println("Nhập Tên");
            String name = scanner.nextLine();
            System.out.println("Nhập Giới tính");
            String gender = scanner.nextLine();
            System.out.println("Nhập Số CMND");
            String cmnd = scanner.nextLine();
            System.out.println("Nhập email");
            String email = scanner.nextLine();
            System.out.println("Nhập Số Điện thoại");
            String phoneNumber = scanner.nextLine();
            System.out.println("Nhập Mã Khách Hàng");
            int idz = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập Kiểu Khách");
            String typeGuest = scanner.nextLine();
            System.out.println("Nhập Địa Chỉ");
            String address = scanner.nextLine();
            Customer customer = new Customer(dateBirth,name,gender,cmnd,email,phoneNumber,idz,typeGuest,address);
            customers.set(index,customer);
            System.out.println("Đã thêm " + name + " vào danh sách khách hàng");
        }

    }


}
