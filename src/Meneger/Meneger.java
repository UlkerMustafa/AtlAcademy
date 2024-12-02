package Meneger;

public class Meneger extends  Employee{
    public String departmentManaged;
    public  static final int MANAGEMENT_PAYMENT = 5000;

    public Meneger(int year, int no, String name, String department) {
        super(year, no, name, department);
        this.departmentManaged = departmentManaged;
    }



    @Override
    public double calculateSalary() {
        return super.calculateSalary() + MANAGEMENT_PAYMENT;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Managed Department: " + departmentManaged);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
