package MiniCalculator;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ededi daxil et");
        double a = scanner.nextInt();
        System.out.println(" ededi daxil et");

        double b = scanner.nextInt();

        var cixilma = new Cixma();
        double cix = cixilma.ferq(a, b);

        var toplaa = new Toplama();
        double topla = toplaa.cem(a,b);

        var bolmee =new Bolme();
        double bol = bolmee.qismet(a,b);

        var vurmaa= new Vurma();
        double vur = vurmaa.hasil(a,b);
        System.out.println(cix);
        System.out.println(topla);
        System.out.println(bol);
        System.out.println(vur);


    }
}
