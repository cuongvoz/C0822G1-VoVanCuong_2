package ss6_inhertiance.practice.shape_object;

public class Square extends Rectangle {
    private double side = 1;
     Square() {
     }
     Square(double side) {
        super(side, side);
    }

     Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

     double getSide() {
        return getWidth();
    }

     void setSide(double side) {
        setWidth(side);
    }

    @Override
     void setWidth(double width) {
        setSide(width);
    }



    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}

