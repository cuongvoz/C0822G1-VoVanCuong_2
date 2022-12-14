package ss7_abstract_class_and_interface.practice.practice_2;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("indigo", false, 6);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }



        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle.compareTo(circle));
        }
    }
}
