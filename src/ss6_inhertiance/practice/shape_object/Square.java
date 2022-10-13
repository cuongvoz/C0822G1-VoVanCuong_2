package ss6_inhertiance.practice.shape_object;

public class Square extends Rectangle {
    private double side = 1;

    public Square() {
    }

    Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
    }

    @Override
    public void setWidth(double width) {
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

