package ss16_io_text_file.practice.practice_3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        try {
            File file = new File("src\\ss16_io_text_file\\practice\\practice_3\\text.txt");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                String[] array = line.split(",");
                Student student = new Student(Integer.parseInt(array[0]), array[1], array[2]);
                studentList.add(student);
            }
            System.out.println("Bạn Hãy CHọn ");
            System.out.println("1. Xóa");
            System.out.println("2. Sửa");
            System.out.println("3. Thêm");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập ID Bạn Muốn Xóa: ");
                    int x = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < studentList.size(); i++) {
                        if (x == studentList.get(i).getId()) {
                            studentList.remove(i);
                        }
                    }
                    break;
                case 2:
                    System.out.print("Nhập ID Bạn Muốn Sửa: ");
                    int z = Integer.parseInt(scanner.nextLine());
                    int index = 0;
                    for (int i = 0; i < studentList.size(); i++) {
                        if (z == studentList.get(i).getId()) {
                            index = i;
                            break;
                        }
                    }
                    studentList.get(index).setId(Integer.parseInt(scanner.nextLine()));
                    studentList.get(index).setName(scanner.nextLine());
                    studentList.get(index).setGender(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Nhập id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập gioi tinh: ");
                    String gender = scanner.nextLine();
                    Student student = new Student(id,name,gender);
                    studentList.add(student);
                    break;
            }


            for (Student key : studentList) {
                System.out.println(key);
            }
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Student key : studentList) {
                bufferedWriter.write(String.format("%s,%s,%s\n", key.getId(), key.getName(), key.getGender()));
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
