package ss6_inhertiance.practice.shape_object;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(5);
        System.out.println(square);
        square = new Square(34, "red", false);


    }
}
