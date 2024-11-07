import java.util.Scanner;

public class yas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Adinizi daxil edin");
        String ad = scanner.nextLine();
        System.out.print("Yasinizi daxil edin");
        int yas = scanner.nextInt();

        int dogum = 2024 - yas;

        System.out.println("Salam!"+  ad + " " + "Siz" + dogum + " " + "ildensiniz");

    }
}
