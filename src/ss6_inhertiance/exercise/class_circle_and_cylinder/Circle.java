package ss6_inhertiance.exercise.class_circle_and_cylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "Blue";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 2 * Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return " radius = " + radius +
                ", color = " + color + ", Area = " + getArea();
    }
}
