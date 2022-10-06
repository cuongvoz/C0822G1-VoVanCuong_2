package ss3_array_and_method.exercise;

import java.util.Scanner;

public class FindMinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array length : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value of [" + i + "] : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("all index of array");
        for (int element : array) {
            System.out.print(element + "\t");
        }
        System.out.println();
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("The min value is : " + min);
    }
}
