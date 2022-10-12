package ss6_inhertiance.practice.shape_object;

public class Circle extends Shape {
    private double radius = 1.0;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getPerimeter() {
        return 2 * getRadius() * Math.PI;
    }

    double getArea() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "+ getRadius() +", which is a subclass of " + super.toString();
    }
}
