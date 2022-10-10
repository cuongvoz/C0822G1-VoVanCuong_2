package ss4_class_and_object.exercise.exercise_2;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn();

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);

        System.out.println("Fan 1 : " + fan1.toString());
        System.out.println("Fan 2 : " + fan2.toString());
    }
}
