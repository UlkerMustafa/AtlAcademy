import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ikireqemli eded daxil edin: ");
        int eded = scanner.nextInt();
        int onluq = eded /10;
        int teklik = eded % 10;
        System.out.println(onluq + " " + teklik);
    }
}
