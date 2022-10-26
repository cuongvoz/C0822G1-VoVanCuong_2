package ss16_io_text_file.exercise.exercise_1;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\ss16_io_text_file\\exercise\\exercise_1\\source.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        List<String> list = new ArrayList<>();
        String line;
        List<String> count = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            String[] x = line.split("");
            for (int i = 0; i < x.length; i++) {
                count.add(x[i]);
            }
            list.add(line);
        }
        bufferedReader.close();
        File file1 = new File("src\\ss16_io_text_file\\exercise\\exercise_1\\target.txt");
        if (!file1.exists()) {
            throw new FileNotFoundException();
        }
        FileWriter fileWriter = new FileWriter(file1);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < list.size(); i++) {
            bufferedWriter.write(list.get(i));
            bufferedWriter.newLine();
        }
        System.out.println("Có " + count.size() + " kí tự trong file");
        bufferedWriter.close();
    }
}
