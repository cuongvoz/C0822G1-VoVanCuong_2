package ss16_io_text_file.practice.practice_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public static void main(String[] args) throws IOException {
     ReadAndWriteFile homie = new ReadAndWriteFile();
     homie.readFile("src\\ss16_io_text_file\\practice\\practice_2\\numbers.txt");
     int x = homie.findMaxValue("\"src\\\\ss16_io_text_file\\\\practice\\\\practice_2\\\\numbers.txt\"");
     homie.writeFile("src\\ss16_io_text_file\\practice\\practice_2\\result.txt",x);
    }
    public List<Integer> readFile(String path) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }
    public void writeFile(String path,int max) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Giá trị lớn nhất là " + max);
        bufferedWriter.close();
    }
    public int findMaxValue(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        int max = 0;
        int num;
        while ( (line = bufferedReader.readLine()) != null) {
            num = Integer.parseInt(line);
            if (max < num) {
                max = num;
            }
        }
        return max;
    }
}
