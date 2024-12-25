package Fiqurlar;

public class Trapesiya extends Fiqurlar {
    public Trapesiya(String name, int teref) {
        super(name, teref);
    }

    @Override
    public void bucaqSayi() {
        System.out.println(" trapesiya terefleri beraber deyil");
    }

    @Override
    public void displayInfo() {
        System.out.println("trapesya dord tereflidir ");
    }


}
