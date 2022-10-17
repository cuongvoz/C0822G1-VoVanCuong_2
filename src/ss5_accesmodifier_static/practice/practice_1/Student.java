package ss5_accesmodifier_static.practice.practice_1;

 public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDITT";

     public Student(int r, String n) {
       this.rollno = r;
       this.name = n;
    }
    static void change() {
         college = "CODEGYM";
    }
    void display() {
        System.out.println("Name is : " + this.name + " and rollno is : " + this.rollno);
        System.out.println("Class Name is " + college);
    }

     public String getName() {
         return this.name;
     }


 }
