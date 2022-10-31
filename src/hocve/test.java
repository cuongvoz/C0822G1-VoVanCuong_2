package hocve;

import java.util.*;

public class test {
    public static void main(String[] args) {
        String code = "s * (s – a) * (s – b) * (s – c)";
        List<Character> bStack = new Stack<>();
        for (int i = 0; i < code.length();i++) {
            bStack.add(code.charAt(i));
        }

    }
}
