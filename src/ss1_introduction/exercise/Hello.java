package ss1_introduction.exercise;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Tên Của Bạn Vào Đây ");
        String name = sc.nextLine();
        System.out.println("Hello Chú " + name + " Vlog");

    }
}
