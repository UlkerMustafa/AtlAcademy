package Kurs;

public class Telebe {
    private  String name;
    private  int ID;

    public Telebe(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Telebe{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
