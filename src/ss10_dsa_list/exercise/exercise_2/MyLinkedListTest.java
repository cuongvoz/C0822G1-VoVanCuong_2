package ss10_dsa_list.exercise.exercise_2;

public class MyLinkedListTest {
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
        Student a = new Student(10, "Cường");
        Student b = new Student(11, "Sỹ");
        Student c = new Student(12, "Phúc");
        Student d = new Student(13, "Minh");
        MyLinkedList<Student> studentList = new MyLinkedList<>();
        studentList.addFirst(a);
        studentList.addLast(b);
        studentList.addLast(c);
        studentList.addLast(d);
        studentList.add(1, new Student(32, "Tài"));
        int i = 0;
        studentList.remove(0);
        while (i < studentList.size()) {
            Student student = (Student) studentList.get(i);
            System.out.print("ID: " + student.getId() + "\t");
            System.out.println("Name: " + student.getName() + "\t");
            i++;
        }
    }
}
