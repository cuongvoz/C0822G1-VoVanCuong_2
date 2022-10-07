package ss3_array_and_method.exercise;

import java.util.Scanner;

public class CountOfChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text : ");
        String str = scanner.nextLine();
        System.out.print("Enter your char : ");
        int count = 0;
        char character = scanner.nextLine().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Số Lần Xuất Hiện Của Kí Tự : " + character + " Là : " + count);
        } else {
            System.out.println("Kí Tự Không Có Trong Chuỗi");
        }

    }
}
