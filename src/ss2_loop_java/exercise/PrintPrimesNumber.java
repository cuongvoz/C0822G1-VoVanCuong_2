package ss2_loop_java.exercise;

import java.util.Scanner;

public class PrintPrimesNumber {
    public static void main(String[] args) {
        int n = 2;
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int soLuong = 0;
        while (soLuong < size) {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(n);
                soLuong++;
            }
            n++;

        }
    }
}
