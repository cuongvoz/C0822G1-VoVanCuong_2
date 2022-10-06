package ss3_array_and_method.exercise;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size Row : ");
        int sizeM = scanner.nextInt();
        System.out.print("Enter size Col : ");
        int sizeN = scanner.nextInt();
        double[][] matrix = new double[sizeM][sizeN];
        for (int i = 0; i < matrix.length;i++) {
            matrix[i] =  new double[sizeN];
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter value of [" + i +"][" + j + "] : ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("The Matrix is : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        double max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Max Value is : " + max);
    }
}
