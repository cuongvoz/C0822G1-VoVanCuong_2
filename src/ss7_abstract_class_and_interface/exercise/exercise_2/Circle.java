package ss7_abstract_class_and_interface.exercise.exercise_2;

public class Circle extends Shape{
    private double radius = 1.0;
    private String name = "Circle";
    public Circle() {
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * getRadius() * Math.PI;
    }

    public double getArea() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "+ getRadius() +", which is a subclass of " + super.toString();
    }

}
