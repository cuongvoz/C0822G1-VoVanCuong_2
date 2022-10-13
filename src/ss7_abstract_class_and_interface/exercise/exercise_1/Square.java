package ss7_abstract_class_and_interface.exercise.exercise_1;

public class Square extends Shape {
    private double side = 1.0;
    private String name = "Square";
    public Square() {
    }

    @Override
    public String getName() {
        return this.name;
    }
    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return this.side;
    }
    public double getPerimeter(){
        return getSide() * 4;
    }
    public double getArea(){
        return Math.pow(getSide(),2);
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() + getSide() * percent / 100);
    }

    @Override
    public String toString() {
        return "A Square " +
                " side = " + getSide() +
                " Area = " + getArea() + " Perimeter = " + getPerimeter() + super.toString();
    }
}
