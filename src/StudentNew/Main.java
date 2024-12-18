package StudentNew;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        var student1=new Student("Lale",1);
        var student3=new Student("Cemil",2);
        var student2 =new Student("Aylin",3);

        var studentList= Arrays.asList(student1,student2,student3);
        System.out.println(studentList);
        Collections.sort(studentList,new StudentComparator());
        System.out.println(studentList);
    }
}
