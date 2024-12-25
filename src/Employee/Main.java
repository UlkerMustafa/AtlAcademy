package Employee;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        var emp1 =new Employee("Aytac",4000,22);
        var emp2 =new Employee("Huseyn",4001,22);
        var emp3 =new Employee("Ulker",5000,28);

        var empList = Arrays.asList(emp1,emp2,emp3);


        System.out.println(empList);
        Collections.sort(empList);
        System.out.println(empList);
    }
}
