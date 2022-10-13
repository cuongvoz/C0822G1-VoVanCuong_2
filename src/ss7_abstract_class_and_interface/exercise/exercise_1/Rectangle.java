package ss7_abstract_class_and_interface.exercise.exercise_1;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double height = 1.0;
    private String name = "Rectangle";
    public Rectangle(){

    }
    public Rectangle(String color, boolean filled) {
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }




    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter() {
        return 2 * (getWidth() * getHeight());
    }

    public double getArea() {
        return getHeight() * getWidth();
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "+ getWidth() +" and length="+getHeight() +", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        setHeight(getHeight() * getHeight() * percent / 100);
        setWidth(getWidth() + getWidth() * percent / 100);
    }
}
