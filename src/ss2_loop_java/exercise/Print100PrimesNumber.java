package ss2_loop_java.exercise;

public class Print100PrimesNumber {
    public static void main(String[] args) {
        int n = 2;
        while (n < 100) {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(n);
            }
            n++;
        }
    }
}
