package ss17_binary_file_serialization.practice.practice_1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
  private static void copyFile(File source,File target) throws IOException {
      Files.copy(source.toPath(),target.toPath(),StandardCopyOption.REPLACE_EXISTING);
  }
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhập Địa Chỉ File Gốc Muốn Sao Chép");
            String source = scanner.nextLine();
            System.out.println("Nhập Địa Chỉ File Copy");
            String target = scanner.nextLine();
            File file1 = new File(source);
            File file2 = new File(target);
            copyFile(file1,file2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
