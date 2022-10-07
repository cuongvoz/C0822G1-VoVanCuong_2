package ss3_array_and_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfColum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter number row : ");
        int size1 = scanner.nextInt();
        System.out.print(" Nhập number col : ");
        int size2 = scanner.nextInt();
        int[][] arr = new int[size1][size2];
        for (int i = 0 ; i < size1;i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print("Enter a value of [" + i +"][" + j +"]  = " );
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0 ; i < arr.length;i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Enter the col which you what to do");
        int col = scanner.nextInt();
        for (int i = 0;i < arr.length;i++) {
            for (int j = 0; j < arr[i].length;j++) {
                if (j == col-1) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of col" + col + " is : " + sum);
    }
}
