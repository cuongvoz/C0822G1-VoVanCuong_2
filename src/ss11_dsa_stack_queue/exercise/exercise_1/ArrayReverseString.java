package ss11_dsa_stack_queue.exercise.exercise_1;
import java.util.Scanner;
import java.util.Stack;

public class ArrayReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> wStack = new Stack<>();
        System.out.print("Nhập Chuỗi Vào Đây : ");
        String mWord = scanner.nextLine();
        System.out.println("Chuỗi Vừa Nhập Là : " + mWord);
        for (int i = 0 ; i < mWord.length();i++) {
            wStack.push(mWord.charAt(i));
        }
        System.out.print("Chuỗi Đảo Ngược Là : ");
        int size = wStack.size();
        for (int i = 0 ;i < size;i++) {
            System.out.print(wStack.pop());
        }
    }
}
