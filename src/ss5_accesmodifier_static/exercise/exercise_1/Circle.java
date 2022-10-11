package ss5_accesmodifier_static.exercise.exercise_1;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    Circle() {
    }

    Circle(double r) {
        this.radius = r;
    }

     double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

}
