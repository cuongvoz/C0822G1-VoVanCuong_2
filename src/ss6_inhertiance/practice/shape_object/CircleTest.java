package ss6_inhertiance.practice.shape_object;

public class CircleTest {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle("Brown", false,5);
        System.out.println(circle1);
        System.out.println("Perimeter of circle = " + circle1.getPerimeter());
        System.out.println("Area of circle = " + circle1.getArea());

        Circle circle2 = new Circle(8);
        System.out.println(circle2);

    }
}
