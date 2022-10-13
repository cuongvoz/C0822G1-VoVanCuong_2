package ss7_abstract_class_and_interface.practice.comparable_and_shape_class;

import ss6_inhertiance.practice.shape_object.Circle;

public class ComparableCircle extends Circle implements
 Comparable<ComparableCircle>{

    public ComparableCircle(){
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(color, filled, radius);
    }
    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
