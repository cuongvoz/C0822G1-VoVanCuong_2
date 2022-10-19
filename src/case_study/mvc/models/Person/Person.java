package case_study.mvc.models.Person;

public abstract class Person {
   private String name;
   private int age;
   private String gender;
   private int idCode;

    public Person() {
    }

    public Person(String name, int age, String gender, int idCode) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idCode = idCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", idCode=" + idCode +
                '}';
    }
}
