package ss6_inhertiance.exercise.class_point2d_and_point3d;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(4, 6);
        point2D.setXY(5, 7);
        System.out.println(point2D);
        
        Point3D point3D = new Point3D(5, 7, 4);
        point3D.setXYZ(4, 9, 9);
        System.out.println(point3D);
    }
}
