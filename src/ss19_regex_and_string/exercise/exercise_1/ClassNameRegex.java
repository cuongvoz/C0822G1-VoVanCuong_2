package ss19_regex_and_string.exercise.exercise_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameRegex {

    public static boolean validate(String text) {
        String regex = "^[CAP]\\d{4}[GHIKLM]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

}
