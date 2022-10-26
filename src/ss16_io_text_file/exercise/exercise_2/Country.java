package ss16_io_text_file.exercise.exercise_2;

public class Country {
    private int id;
    private String code;
    private String name;

    public Country() {
    }

    public Country(int id, String code, String fullName) {
        this.id = id;
        this.code = code;
        this.name = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " ID: " + id +
                ", code: " + code +
                ", tên: " + name ;

    }
}
