package Bank;

public interface PaymentService {
    void pay (double amount)
            throws
            InsufficentFundsException,
            InvalidAmountException;
    void  refund (double amount)
        throws InvalidAmountException;
}
