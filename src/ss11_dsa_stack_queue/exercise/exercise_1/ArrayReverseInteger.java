package ss11_dsa_stack_queue.exercise.exercise_1;

import java.util.*;

public class ArrayReverseInteger {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng : ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0 ; i < size;i++) {
            System.out.print("Nhập Phần Tử " + i + " : ");
            int number = Integer.parseInt(scanner.nextLine());
            stack.push(number);
        }
        System.out.println("Stack Vừa Nhập Là " + stack);
        int i = 0;
        while (i < size) {
            array[i] = stack.pop();
            i++;
        }
        int z = 0;
        do {
            stack.push(array[z]);
            z++;
        } while (z < size);
        System.out.println("Stack Đảo Ngược Là : " + stack);
    }
}
