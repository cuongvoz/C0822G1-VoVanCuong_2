package case_study.mvc.service.impl;

import case_study.mvc.model.Employee;
import case_study.mvc.service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    static {
        Employee employee1 = new Employee("3/8/2001","Võ Văn Cường","Nam","213308382","mainvov@gmail.com","3200012","1","Trung Cấp",5000,"Lao công");
        Employee employee2 = new Employee("1/2/2001","Nguyễn Văn A","Nam","121663890","dsaasd@gmail.com","45154984","2","Đại Học",5000,"Bảo Vệ");
        Employee employee3 = new Employee("9/9/2001","Nguyễn Văn B","Nam","994873284","dsadsa23cx@gmail.com","5957474","3","Cao Đẳng",5000,"Pha Cà Phê");
        Employee employee4 = new Employee("8/12/2001","Nguyễn Văn C","Nam","328767546","dsakjdk2@yahoo.com","28547643","4","Sau Đại Học",5000,"Chủ Tịch");
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
    }

    @Override
    public void display() {
        for (Employee x: employeeList) {
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
        System.out.println("Nhập Mã Nhân Viên");
        String id = scanner.nextLine();
        System.out.println("Nhập Trình Độ");
        String level = scanner.nextLine();
        System.out.println("Nhập Lương");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập Vị Trí");
        String position = scanner.nextLine();
        Employee employee = new Employee(dateBirth,name,gender,cmnd,email,phoneNumber,id,level,salary,position);
        employeeList.add(employee);
        System.out.println("Đã thêm " + name + " vào danh sách nhân viên");
        display();
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID Mã Nhân Viên Bạn Muốn Sửa: ");
        String id = scanner.nextLine();
        int index = 0;
        boolean check = false;
        for (int i = 0 ; i < employeeList.size();i++) {
            if(employeeList.get(i).getEmployeeCode() == id) {
                index = i;
                check = true;
            }
        }
        if (!check) {
            System.out.println("Bạn nhập sai mã nhân viên hoặc mã nhân viên không tồn tại: ");
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
            System.out.println("Nhập Mã Nhân Viên");
            String idz = scanner.nextLine();
            System.out.println("Nhập Trình Độ");
            String level = scanner.nextLine();
            System.out.println("Nhập Lương");
            double salary = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập Vị Trí");
            String position = scanner.nextLine();
            Employee employee = new Employee(dateBirth,name,gender,cmnd,email,phoneNumber,idz,level,salary,position);
            employeeList.set(index,employee);
            System.out.println("Đã thêm " + name + " vào danh sách nhân viên");
        }

    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID Mã Nhân Viên Bạn Muốn Xóa: ");
        String id = scanner.nextLine();
        int index = 0;
        boolean check = false;
        for (int i = 0 ; i < employeeList.size();i++) {
            if(employeeList.get(i).getEmployeeCode().equals(id)) {
                index = i;
                check = true;
            }
        }
        if (!check) {
            System.out.println("Bạn nhập sai mã nhân viên hoặc mã nhân viên không tồn tại: ");
            edit();
        } else {
            String name = employeeList.get(index).getName();
            employeeList.remove(index);
            System.out.println("Đã xóa " + name + " khỏi danh sách nhân viên");
        }
    }
}
