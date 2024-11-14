import java.util.Scanner;

public class Lesson4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ededi daxil edin: ");
        int eded = scanner.nextInt();
        int reqemSayi = String.valueOf(Math.abs(eded)).length();

        System.out.println(eded + " " + reqemSayi + " rəqəmli ədəddir.");


    }
}
