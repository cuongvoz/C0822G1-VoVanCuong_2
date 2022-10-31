package ss19_regex_and_string.practice.practice_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String ACOUNT_REGEX = "^[a-z_0-9]{6,}$";
    public AccountExample() {
      pattern = Pattern.compile(ACOUNT_REGEX);
    }
    public boolean validate(String text) {
        matcher = pattern.matcher(text);
        return matcher.matches();
    }
}
