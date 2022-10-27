package ss17_binary_file_serialization.practice.practice_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OutputSteamStudy {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src\\ss17_binary_file_serialization\\practice\\practice_2\\students.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        objectOutputStream.writeObject(students);
        objectOutputStream.close();
    }
}
