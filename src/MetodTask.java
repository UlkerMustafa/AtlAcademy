import java.util.Scanner;


public class MetodTask {
    public static double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ededi daxil edin: ");
        int base = scanner.nextInt();

        System.out.print("Quvveti daxil edin: ");
        int exponent = scanner.nextInt();
        double result = power(base, exponent);
        System.out.println(base + " üssü " + exponent + " = " + result);

    }
}
