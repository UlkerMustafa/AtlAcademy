package Academy;

public class Main {
    public static void main(String[] args) {
        Academy academy = new Academy("AtL Academy", "102a Cəlil Məmmədquluzadə küçəsi");
        academy.displayInfo();
        System.out.println();

        Student student = new Student(254686 ,"JAVA", academy.getName(), academy.getAddress());
        student.displayInfo();
        student.study();
        System.out.println();


        Teacher teacher = new Teacher(321831,"Backend", academy.getName(), academy.getAddress());
        teacher.displayInfo();
        teacher.teach();
    }


}
