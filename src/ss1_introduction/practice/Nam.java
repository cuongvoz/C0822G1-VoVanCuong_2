package ss1_introduction.practice;

import java.util.Scanner;

public class Nam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("a :");
        a = sc.nextDouble();
        System.out.print("b :");
        b = sc.nextDouble();
        System.out.print("c :");
        c = sc.nextDouble();
        if (a != 0) {
            double answer = a * (b + c);
            System.out.print(answer + " Tổng");
        } else {
            if (b == 0) {
                System.out.print("Ủa Alo");
            } else {
                System.out.print("Ahihi");
            }
        }
    }
}
