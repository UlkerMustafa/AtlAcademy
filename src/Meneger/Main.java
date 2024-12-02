package Meneger;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(2023,1,"ulker","IT");
        Meneger m1 = new Meneger(2020,2,"konul","Menencer");
        Director d1 = new Director(2019,3,"cemil","director");
        e1.displayInfo();
        System.out.println("----------------------");
        m1.displayInfo();
        System.out.println("----------------------");
        d1.displayInfo();
    }
}
