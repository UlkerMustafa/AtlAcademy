package Function;

import TUR.Customer;

import java.util.function.Consumer;

public class main {
    public static void main(String[] args) {
        Function sum = ((a,b)-> a + b);   //lyamda exseption
        System.out.println(sum.operation(3,2));


    Function sum1= (Integer::sum);  //metod refereance

        System.out.println(sum1.operation(23,34));

        FunctionCixma cix = ((a,b )-> a-b);
        System.out.println(cix.cixma(45,12));

        Bolme bol = ((a,b)-> (int) (a/b));
        System.out.println(bol.bolme(12,3));
}}
