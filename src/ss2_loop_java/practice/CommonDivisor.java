package ss2_loop_java.practice;

import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = scanner.nextInt();
        System.out.println("Enter number b");
        int b = scanner.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("Not greatest common factor");
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("Greatest common factor is " + a);
        }
    }
}
