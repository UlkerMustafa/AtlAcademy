package Bank;

public abstract class BankOperation {


    public abstract double checkBalance();
    public abstract void addBalance(double amount)
            throws InvalidAmountException, InsufficentFundsException;
}
