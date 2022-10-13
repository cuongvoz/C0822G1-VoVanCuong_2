package ss7_abstract_class_and_interface.exercise.exercise_1;

public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Pink", true, 5);
        shapes[1] = new Rectangle(6, 9);
        shapes[2] = new Square("Red", false, 9);

        double percent = Math.floor(Math.random() * 100) + 1;
        System.out.println("Pre-resize: ");
        for (Shape shape : shapes) {
            System.out.println("\t " + shape.getName() + " Area: " + shape.getArea());
        }
        System.out.println("precent: " + percent);

        System.out.println("After-resize: ");
        for (Shape shape : shapes) {
            shape.resize(percent);
            System.out.println("\t " + shape.getName() + " Area: " + shape.getArea());
        }
    }
}

