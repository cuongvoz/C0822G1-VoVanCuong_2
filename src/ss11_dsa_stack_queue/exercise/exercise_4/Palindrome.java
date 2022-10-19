package ss11_dsa_stack_queue.exercise.exercise_4;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Character> queue = new LinkedList();
        Stack<Character> stack = new Stack();
        System.out.print("Bạn Nhập Chuỗi Vào Đây : ");
        String text = scanner.nextLine();
        String textFix = text.toLowerCase();
        for (int i = 0; i < textFix.length(); i++) {
            queue.add(textFix.charAt(i));
            stack.push(textFix.charAt(i));
        }
        String check = "Đây là chuỗi palindrome";
        for (int i = 0; i < textFix.length(); i++) {
            if (!queue.poll().equals(stack.pop())) {
                check = "Không phải là chuỗi palindrome";
                break;
            }
        }
        System.out.print(check);
    }
}
