package Bank;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("ULKA ", 1100, "1233" );
        BankCustomer customer1 = new BankCustomer(customer);
        try {

            customer1.checkBalance();
            customer1.addBalance(300);
            customer1.checkBalance();
            customer1.pay(200);
            customer1.refund(100);
            customer1.checkBalance();
        } catch (InsufficentFundsException | InvalidAmountException e) {
            System.out.println("Eror: " + e.getMessage());
        }
        try {
            customer1.addBalance(-50);


        }
        catch (InvalidAmountException e){
            System.out.println("xeta: " + e.getMessage());
        } catch (InsufficentFundsException e) {
            throw new RuntimeException(e);
        }
    }


}
