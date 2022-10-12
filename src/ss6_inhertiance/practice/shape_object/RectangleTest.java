package ss6_inhertiance.practice.shape_object;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(6,7);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle("Blue",false,5,7);
        System.out.println(rectangle2);
    }
}
