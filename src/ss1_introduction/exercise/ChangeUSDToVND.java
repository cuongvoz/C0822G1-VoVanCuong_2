package ss1_introduction.exercise;

import java.util.Scanner;

public class ChangeUSDToVND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd = 23000;
        System.out.print("Nhập Số Tiền USD : ");
        double usd = sc.nextDouble();
        double convert = usd * vnd;
        System.out.println(" Số Tiền VND Của Bạn Là : " + convert + " VNĐ");
    }
}
