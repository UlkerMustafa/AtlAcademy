package Fiqurlar;

abstract class Fiqurlar {
    String name;
    int teref;
    public abstract void bucaqSayi ();
    public abstract void displayInfo();
    public void terefSayi(){
        System.out.println("teref sayi ");
    }

    public Fiqurlar(String name, int teref) {
        this.name = name;
        this.teref = teref;
    }

    @Override
    public String toString() {
        return "Fiqurlar{" +
                "name='" + name + '\'' +
                ", teref=" + teref +
                '}';
    }
}
