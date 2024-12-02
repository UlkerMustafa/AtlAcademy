package Meneger;

public class Director extends  Meneger{
    public double bonus;

    public Director(int year, int no, String name, String department) {
        super(year, no, name, department);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary with Bonus: " + calculateSalary());
    }
}
