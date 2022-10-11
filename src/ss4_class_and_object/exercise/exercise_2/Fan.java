package ss4_class_and_object.exercise.exercise_2;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = SLOW;
    private boolean on;
    private double radius = 5;
    private String color = "Blue";

     int getSpeed() {
        return this.speed;
    }

     void setSpeed(int speed) {
        this.speed = speed;
    }

     boolean isOn() {
        return this.on;
    }

     void setOn() {
        this.on = true;
    }

     void setOff() {
        this.on = false;
    }

     double getRadius() {
        return radius;
    }

     void setRadius(double radius) {
        this.radius = radius;
    }

     String getColor() {
        return this.color;
    }

     void setColor(String color) {
        this.color = color;
    }

     Fan() {
    }

    @Override
    public String toString() {
        if (this.isOn()) {
            return "speed=" + getSpeed() +
                    ", radius=" + getRadius() +
                    ", color='" + getColor() + " fan is on";

        } else {
            return "radius=" + getRadius() +
                    ", color='" + getColor() + " fan is off";
        }
    }
}
