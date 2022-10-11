package ss5_accesmodifier_static.practice.practice_1;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student student1 = new Student(12, "Nguyễn Văn A");
        Student student2 = new Student(4, "Nguyễn Văn B");


        student1.display();
        Student.change();
        student2.display();
    }
}
