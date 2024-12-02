package Bank;

public class  InsufficentFundsException extends Exception {
    public   InsufficentFundsException(String massage){
        super(massage);
    }
}
