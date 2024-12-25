package Academy;

public class Student extends Academy {
    public int length;
    private int studentId;
    private String course;
    private String studentName;



    public Student(int studentId, String course, String name, String address) {
        super(name, address);
        this.studentId = studentId;
        this.course = course;
    }

    public Student(String name, String address) {
        super(name, address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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
