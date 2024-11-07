import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner (System.in);
//        int a=scanner.nextInt();
//        int b=scanner.nextInt();
//
//       int bolme = a/b;
//       int qaliq = a%b;
//
//       System.out.println( bolme);
//        System.out.println( qaliq);

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();


        int onluq = a / 10;
        int teklik = a % 10;

        System.out.println(teklik);
        System.out.println(onluq);
        System.out.println(teklik + onluq);
        System.out.println(teklik * onluq);
    }
}
