package ss3_array_and_method.practice;

public class dsa {
    public static void main(String[] args) {
        int[] a = {1, 9, 3, 10, 2};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
        for (int element : a) {
            System.out.print(element + "\t");
        }
    }
}
