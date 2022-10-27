package ss17_binary_file_serialization.practice.practice_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class InputStreamStudy {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src\\ss17_binary_file_serialization\\practice\\practice_2\\students.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Student> students = (List<Student>) objectInputStream.readObject();

        for (Student stu : students) {
            System.out.println(stu);
        }
    }
}
