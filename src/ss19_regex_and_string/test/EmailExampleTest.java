package ss19_regex_and_string.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExampleTest {
    public static void main(String[] args) {
        String[] email = {"a@gmail.com", "ab@yahoo.com" , "abc@hotmail.com",
        "@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

//        String regexz = "^(.+)@(.+)$";
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        Pattern pattern = Pattern.compile(regex);

        long start = System.currentTimeMillis();
        for(String x : email) {
            Matcher matcher = pattern.matcher(x);
            boolean z = matcher.matches();
            System.out.println("Email is: "  + x +" is valid: "+ z);
        }
        System.out.println("Kết thúc : " + (System.currentTimeMillis() - start) + "ms");

    }
}
