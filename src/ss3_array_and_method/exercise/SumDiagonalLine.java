package ss3_array_and_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter number size : ");
        int size1 = scanner.nextInt();
        int[][] arr = new int[size1][size1];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.print("Enter a value of [" + i + "][" + j + "]  = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                sum += arr[i][j];
                arr1[i] = arr[i][j];
                break;
            }
        }

        int a = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = a; j < arr[i].length; j++) {
                if (arr[i][j] != arr1[i])
                    sum += arr[i][j];
                break;
            }
            a++;
        }
        System.out.println("Sum of diagonal Line is : " + sum);
    }
}
