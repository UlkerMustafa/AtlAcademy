package Meneger;

public class Employee {

    public int no;
    public String name;
    public int year;
    public String department;
    public static final int BASE_SALARY = 500;

    public Employee(int year, int no, String name, String department) {
        this.year = year;
        this.no = no;
        this.name = name;
        this.department = department;
    }
    public double calculateSalary() {
        return BASE_SALARY * year;
    }
    public void displayInfo() {
        System.out.println("Employee No: " + no);
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + calculateSalary());
    }
}
