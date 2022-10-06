package ss2_loop_java.practice;

import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        money = scanner.nextDouble();
        System.out.print("Enter a number of month: ");
        month = scanner.nextInt();
        System.out.print("Enter annual interest rate in percentage : ");
        interset_rate = scanner.nextDouble();
        double total_interset = 0;
        for (int i = 0; i < month;i++) {
            total_interset = money * (interset_rate/100/12) * 3;
        }
        System.out.println("Total of interset : " + total_interset);
    }
}
