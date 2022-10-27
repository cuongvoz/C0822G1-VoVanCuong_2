package ss16_io_text_file.exercise.exercise_2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CountryDisplay {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();
        try {
            File file = new File("src\\ss16_io_text_file\\exercise\\exercise_2\\country.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            List<String> strings = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            for(String line :strings){
                System.out.println(line);
                String[] x = line.split(",");
                Country country = new Country(Integer.parseInt(x[0]), x[1], x[2]);
                countries.add(country);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("xảy ra ngoại lệ " + e.getMessage());
        }
    }
}
