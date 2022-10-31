package ss19_regex_and_string.test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Hello");
        for (int i=0; i<100000; i++){
            buffer.append("Word");
        }
        System.out.println("StringBuffer is: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder buider = new StringBuilder("Hello");
        for (int i=0; i<100000; i++){
            buider.append("Word");
        }
        System.out.println("StringBuilder is: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        String string = "Hello";
        for (int i= 0; i< 100000;i++) {
            string += "Word";
        }
        System.out.println("String literal is: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        String text = new String("Hello");
        for (int i =0;i < 100000;i++){
            text += "Word";
        }
        System.out.println("new String is: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
