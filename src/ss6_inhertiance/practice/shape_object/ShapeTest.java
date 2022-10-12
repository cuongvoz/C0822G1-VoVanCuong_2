package ss6_inhertiance.practice.shape_object;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape1 = new Shape("Red",false);
        System.out.println(shape1);
    }
}
