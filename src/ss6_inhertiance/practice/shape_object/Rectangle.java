package ss6_inhertiance.practice.shape_object;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double height = 1.0;
    Rectangle(){

    }
    Rectangle(String color, boolean filled) {
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }




    double getWidth() {
        return width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getPerimeter() {
        return 2 * (getWidth() * getHeight());
    }

    double getArea() {
        return getHeight() * getWidth();
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "+ getWidth() +" and length="+getHeight() +", which is a subclass of " + super.toString();
    }
}
