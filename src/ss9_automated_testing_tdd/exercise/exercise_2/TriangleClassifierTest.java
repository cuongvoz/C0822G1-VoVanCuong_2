package ss9_automated_testing_tdd.exercise.exercise_2;

import java.util.Scanner;

public class TriangleClassifierTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x: ");
        int x = sc.nextInt();
        System.out.print("Nhập y: ");
        int y = sc.nextInt();
        System.out.print("Nhập z: ");
        int z = sc.nextInt();
        TriangleClassifier.triangleClassifier(x,y,z);
    }
}
