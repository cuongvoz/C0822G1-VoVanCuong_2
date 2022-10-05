package ss1_introduction.practice;

import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float height;
        float weight;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height: ");
        height = sc.nextFloat();
        System.out.println("Enter Weight: ");
        weight = sc.nextFloat();
        float area = height * weight;
        System.out.println("The area is : " + area);
    }

}
