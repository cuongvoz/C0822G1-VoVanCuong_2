package ss8_clean_code_refactoring.practice.practice_3;

public class Cylinder {
    public static double getVolume(int radius, int height) {
        double baseArea = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        return perimeter * height + 2 * baseArea;

    }

    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
