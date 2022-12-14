package ss4_class_and_object.exercise.exercise_1;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public void condition() {
        if (getA() == 0) {
            if (getB() == 0) {
                if (getC() == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                System.out.println("Phương trình có một nghiệm là :  x = " + (-getC() / getB()));
            }
        }
    }

    public double getDiscriminant() {
        return Math.pow(getB(), 2) - (4 * getA() * getC());
    }

    public double getRoot1() {
        return (-getB() + Math.sqrt(Math.pow(getB(), 2) - 4 * getA() * getC())) / (2 * getA());
    }

    public double getRoot2() {
        return (-getB() - Math.sqrt(Math.pow(getB(), 2) - 4 * getA() * getC())) / (2 * getA());
    }

}
