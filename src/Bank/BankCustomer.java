package Bank;

public class BankCustomer extends BankOperation implements PaymentService {
    private Customer customer;

    public BankCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void pay(double amount) throws
            InsufficentFundsException,
            InvalidAmountException {
        if (amount <= 0) {
            throw new
                    InvalidAmountException(" Mebleg 0 dan boyuk olmalidir");
        }
        if (customer.getBalance() < amount) {
            throw new
                    InsufficentFundsException("Balansiniz kifayet deyil");

        }
        System.out.println(amount + " AZN odenis edildi.");
    }



    @Override
    public void refund(double amount)
            throws InvalidAmountException {
        if (amount <= 0) {
            throw new
                    InvalidAmountException(" Mebleg 0 dan boyuk olmalidir");

        }
       customer.updateBalance(amount);
        System.out.println(amount + "AZN geri qaytarildi");
    }

    @Override
    public double checkBalance() {
        return  customer.getBalance();

        
    }

    @Override
    public void addBalance(double amount) throws InvalidAmountException, InsufficentFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("mebleg 0 boukdur");
        }
        if (customer.getBalance() < amount)
            throw new InsufficentFundsException("balans kifayet etmir");
        customer.updateBalance(-amount);
        System.out.println("odenis edildi; "+ amount);
    }



    }

