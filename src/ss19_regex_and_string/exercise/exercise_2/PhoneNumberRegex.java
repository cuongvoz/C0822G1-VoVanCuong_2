package ss19_regex_and_string.exercise.exercise_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberRegex {

    public static boolean validate(String text) {
        String regex = "^\\(\\d{2}\\)[- ]\\(0\\d{9}\\)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

}
