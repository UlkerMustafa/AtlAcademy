package Academy;

public class Student extends Academy {
    private int studentId;
    private String course;

    public Student(int studentId, String course, String name, String address) {
        super(name, address);
        this.studentId = studentId;
        this.course = course;
    }





    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void study() {
        System.out.println("Student ID " + studentId + " is taking the course: " + course);
    }
}
