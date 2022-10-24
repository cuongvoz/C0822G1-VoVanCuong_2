package ss11_dsa_stack_queue.exercise.exercise_1;

import java.util.*;

public class ArrayReverseInteger {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng : ");
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0 ; i < size;i++) {
            System.out.print("Nhập Phần Tử " + i + " : ");
            stack.push(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println("Stack vừa nhập là " + stack);
        int[] array = new int[stack.size()];
        for (int i = 0 ; i < array.length;i++) {
            array[i] = stack.pop();
        }
        for (int i = 0 ; i < array.length;i++) {
            stack.push(array[i]);
        }
        System.out.println("Mảng stack hiện tại là " + stack);
    }
}
