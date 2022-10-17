package ss9_automated_testing_tdd.exercise.exercise_2;

public class TriangleClassifier {
    public static void triangleClassifier(int a,int b, int c) {
        boolean tamGiacDeu = a == b && b == c && c == a;
        boolean tamGiacCan = a == b  && a + b > c;
        boolean khongPhaiTamGiac = a <= 0 || b <= 0 || c <= 0 || a + c < b || b + a < c || c + b < a;
        if (tamGiacDeu) {
            System.out.println("Tam giác đều");
        } else if (tamGiacCan) {
            System.out.println("Tam Giác Cân");
        } else if (khongPhaiTamGiac) {
            System.out.println("Không Phải Tam Giác");
        } else {
            System.out.println("Tam giác thường");
        }
    }
}
