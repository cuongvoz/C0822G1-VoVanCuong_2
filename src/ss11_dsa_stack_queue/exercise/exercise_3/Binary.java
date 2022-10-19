package ss11_dsa_stack_queue.exercise.exercise_3;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Số Vào Đây : ");
        int number = Integer.parseInt(scanner.nextLine());
        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }
        System.out.println(stack);
        System.out.println("độ dài mảng là " + stack.size());
        int[] array = new int[stack.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.print("Số Nhị Phân Vừa Chuyển Đổi Là : ");
        for (int key : array) {
            System.out.print(key);
        }
    }
}
