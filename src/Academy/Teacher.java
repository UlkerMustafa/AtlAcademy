package Academy;

public class Teacher extends Academy {
    private int teacherId;
    private String subject;

    public Teacher(int teacherId, String subject, String name, String address) {
        super(name, address);
        this.teacherId = teacherId;
        this.subject = subject;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void teach() {
        System.out.println("Teacher ID " + teacherId + " is teaching the subject: " + subject);
    }
}
