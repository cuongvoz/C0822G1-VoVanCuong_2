package ss1_introduction.practice;

import java.util.Scanner;

public class HowManyDayInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        System.out.print("Tháng Bạn Muốn Tính Là Tháng Mấy ? ");
        month = sc.nextInt();
        switch (month) {
            case 2:
                System.out.print("Tháng " + month + " Có 28 Ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("Tháng " + month + " Có 31 Ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("Tháng " + month + " Có 30 Ngày");
                break;
            default:
                System.out.print("Tháng Bạn Nhập Không Tồn Tại");
        }

    }
}
