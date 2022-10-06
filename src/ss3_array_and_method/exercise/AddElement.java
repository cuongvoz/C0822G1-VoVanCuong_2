package ss3_array_and_method.exercise;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] arrayNumber = {1, 2, 3, 4, 5, 6, 0, 0, 0, 0};
        for (int element : arrayNumber) {
            System.out.print(element + " ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        System.out.println("Enter index : ");
        int index = scanner.nextInt();
        if (index <= -1 || index > arrayNumber.length - 1) {
            System.out.println("Cannot add element to array");
        } else {
            for (int i = arrayNumber.length - 1; i >= 0; i--) {
                arrayNumber[i] = arrayNumber[i - 1];
                if (i == 1) {
                    break;
                }
            }
            arrayNumber[index] = num;
        }
        for (int element : arrayNumber) {
            System.out.print(element + " ");
        }
    }
}
