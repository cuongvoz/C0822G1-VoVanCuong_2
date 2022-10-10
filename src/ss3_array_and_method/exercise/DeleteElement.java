package ss3_array_and_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] numbers = {10, 4, 7, 6, 8, 6, 0, 0, 0};
        System.out.println(Arrays.toString(numbers) + "\t");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number which you want to delete: ");
        int number = scanner.nextInt();
        for (int i = 0; i < numbers.length - 1; i++) {
            if (number == numbers[i]) {
                numbers[i] = numbers[i + 1];
                for (int j = i; j < numbers.length - 1; j++) {
                    numbers[j] = numbers[j + 1];
                }
            }
        }
        System.out.print(Arrays.toString(numbers) + "\t");
    }
}
