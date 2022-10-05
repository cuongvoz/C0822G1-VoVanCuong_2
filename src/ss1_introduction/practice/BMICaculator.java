package ss1_introduction.practice;

import java.util.Scanner;

public class BMICaculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Chiều Cao Của Bạn : ");
        double height = sc.nextDouble();
        System.out.print("Nhập Cân Nặng Của Bạn : ");
        double weight = sc.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Kết Quả\n");
        if (bmi < 18.5) {
            System.out.printf("%-20.2f%s", bmi, "Gầy Nghiện");
        } else if (18.5 <= bmi && bmi < 25.0) {
            System.out.printf("%-20.2f%s", bmi, "Bình Thường");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.printf("%-20.2f%s", bmi, "Thừa Cân");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Béo Phì");
        }
    }
}
