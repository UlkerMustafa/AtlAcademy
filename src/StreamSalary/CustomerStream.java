package StreamSalary;

public class CustomerStream {
    private String name;
    private Double debit;

    public CustomerStream(String name, Double debit) {
        this.name = name;
        this.debit = debit;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDebit() {
        return debit;
    }

    public void setDebit(Double debit) {
        this.debit = debit;
    }

    @Override
    public String toString() {
        return "CustomerStream{" +
                "name='" + name + '\'' +
                ", debit=" + debit +
                '}';
    }
}
