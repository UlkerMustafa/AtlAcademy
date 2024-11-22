package Academy;

public class Academy {
    private String name;
    private String address;

    public Academy(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void displayInfo() {
        System.out.println("Academy Name: " + name);
        System.out.println("Academy Address: " + address);
    }
}
