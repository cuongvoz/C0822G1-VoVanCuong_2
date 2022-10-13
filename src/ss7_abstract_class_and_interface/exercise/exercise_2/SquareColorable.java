package ss7_abstract_class_and_interface.exercise.exercise_2;

public class SquareColorable extends Square implements Colorable {

    public SquareColorable() {
    }

    public SquareColorable(double side) {
        super(side);
    }

    @Override
    public void howToColor() {
        System.out.println(" Color All Four Size");
    }
}
