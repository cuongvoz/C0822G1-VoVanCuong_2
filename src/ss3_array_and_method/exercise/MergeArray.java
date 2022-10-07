package ss3_array_and_method.exercise;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array 1");
        int size1 = scanner.nextInt();
        System.out.println("Enter size array 2");
        int size2 = scanner.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        int[] arr3 = new int[size1 + size2];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter number of index array 1 : [" + i + "] ");
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter number of index array 2 : [" + i + "] ");
            arr2[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int index = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            arr3[index] = arr2[i];
            index++;
        }
        for (int element : arr3) {
            System.out.print(element + " ");
        }
    }
}
