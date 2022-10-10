package ss4_class_and_object.exercise.exercise_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a : ");
        double a = scanner.nextDouble();
        System.out.print("Nhập số b : ");
        double b = scanner.nextDouble();
        System.out.print("Nhập số c : ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (a == 0) {
            quadraticEquation.condition();
        } else {
            if (quadraticEquation.getDiscriminant() > 0) {
                System.out.println("Phương trình có 2 nghiệm phân biệt : ");
                System.out.println("x1 = " + quadraticEquation.getRoot1());
                System.out.println("x2 = " + quadraticEquation.getRoot2());
            } else if (quadraticEquation.getDiscriminant() == 0) {
                System.out.println("Phương trình có một nghiệm kép : " + quadraticEquation.getRoot1());
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }

    }
}
