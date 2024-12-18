package StreamSalary;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public static void main(String[] args) {
        List<CustomerStream> customers = new ArrayList<>();
       customers.add(new CustomerStream("Emin", 350.0));
       customers.add(new CustomerStream("Lale",250.3));
       customers.add(new CustomerStream("Cemil",456.7));
        customers.add(new CustomerStream("Lale",556.7));
        customers.add(new CustomerStream("Famil",756.7));



        customers.stream()
                .filter(CustomerStream -> CustomerStream.getDebit() > 350)
                .peek(CustomerStream -> CustomerStream.setDebit(CustomerStream.getDebit() +50))
                .forEach(System.out::println);

    }
}
