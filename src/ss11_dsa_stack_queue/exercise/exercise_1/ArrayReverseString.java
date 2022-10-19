package ss11_dsa_stack_queue.exercise.exercise_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ArrayReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> wStack = new Stack<>();
        System.out.print("Nhập Chuỗi Vào Đây : ");
        String mWord = scanner.nextLine();
        System.out.println("Chuỗi Vừa Nhập Là : " + mWord);
        String[] stringArray = mWord.split("");
        for (int i = stringArray.length-1 ; i >= 0;i--) {
            wStack.push(stringArray[i]);
        }
        System.out.print("Chuỗi Đảo Ngược Là : ");
        for (int i = stringArray.length-1; i >= 0;i--) {
            System.out.print(stringArray[i]);
        }
        System.out.println();
        System.out.println("Stack : " + wStack);
    }
}
