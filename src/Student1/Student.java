package Student1;

public class Student {

    private String name;
    private int ID;

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
