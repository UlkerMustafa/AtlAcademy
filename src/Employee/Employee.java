package Employee;

import java.util.Arrays;
import java.util.Collections;

public class Employee  implements  Comparable<Employee>{
    private String name;
    private Integer salary;
    private Integer age;


    @Override
    public int compareTo (Employee emp1){
//        return Integer.compare(emp1.age,this.age);
    return  emp1.getName().compareTo(this.getName()
    );     //string gore yazilis.ada gore siralayis

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public Employee(String name, Integer salary, Integer age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
