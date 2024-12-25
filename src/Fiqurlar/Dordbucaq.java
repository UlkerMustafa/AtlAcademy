package Fiqurlar;

public class Dordbucaq extends Fiqurlar{
    public Dordbucaq(String name, int teref) {
        super(name, teref);
    }

    @Override
    public void bucaqSayi() {
        System.out.println("dordbucaqli 2 terefi beraberdir");
    }

    @Override
    public void displayInfo() {
        System.out.println("dordbucaqli terefleri muxtelif kvadratdir");
    }
}
