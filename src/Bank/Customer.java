package Bank;

public class Customer {

    private String name;
    private double balance;
    private String customerId;
    public void updateBalance(double amount){
        this.balance += amount;
    }

    public Customer(String name, double balance, String customerId) {
        this.name = name;
        this.balance = balance;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

