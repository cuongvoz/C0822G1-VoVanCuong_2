package ss10_dsa_list.exercise.exercise_1;

public class MyArrayListTest {
    public static class Student {
        private int id;
        private String name;


        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return this.id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return this.name;
        }


        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(3, "Cường");
        Student b = new Student(65, "Định");
        Student c = new Student(12, "Nghĩa");
        Student d = new Student(65, "Tài");

        MyArrayList<Student> studentList = new MyArrayList<>();
        studentList.add(a);
        studentList.add(b);
        studentList.add(c);
        studentList.add(d);
        studentList.remove(1);
        MyArrayList<Student> myArrayList = studentList.clone();
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print("ID : " + myArrayList.get(i).getId());
            System.out.println(" Tên : " + myArrayList.get(i).getName());
        }

    }
}
