package ss6_inhertiance.exercise.class_circle_and_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3,"Blue");
        System.out.println("Circle " + circle);

        Cylinder cylinder = new Cylinder(7,"Red",6);
        System.out.println(cylinder);
    }
}
