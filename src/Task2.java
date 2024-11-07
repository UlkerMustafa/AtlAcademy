import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" eded daxil edin");

        int x = scanner.nextInt();

        boolean result = (x%3==0 && x%4==0);
        System.out.println(result);














//        int a = x / 1000;
//        System.out.println(" eded " + a);
//        int b = (x / 100) % 10;
//        System.out.println(" eded " + b);
//        int c = (x/ 10) % 10;
//        System.out.println(" eded " + c);
//        int d = x % 10;
//        System.out.println(" eded " + d);
//
//        boolean result = ( a<b && b<c && c<d );
//        System.out.println(result);












//       boolean result = (a >=100 && a <=999);
//        System.out.println(result);


//        int b = (a / 100) ;
//        System.out.println("1ci eded " + b);
//        int c = (a / 10) % 10;
//        System.out.println("2ci eded "+ c);
//        int d = a % 10;
//        System.out.println("3ci eded "+ d);
//
//        boolean result= ( b==d);
//
//        System.out.println(result);


//        int minlik = a/1000;
//        System.out.println(" eded " + minlik);
//        int yuzluk = (a/100)%10;
//        System.out.println(" eded " + yuzluk);
//        int onluq = ( a/10)%10;
//        System.out.println(" eded "+ onluq);
//        int teklik = a%10;
//        System.out.println(" eded "+ teklik);
//
//        int b = teklik*1000+yuzluk*100+onluq*10+minlik;
//        System.out.println(b+10);


//        int b = (a / 100) ;
//        int c = (a / 10) % 10;
//        int d = a % 10;
//
//        int f= d*100+c*10+b;
//
//        System.out.println("ededi tersine yaz" + f);


//        if (a == b) {
//            System.out.println("Ededler beraberdir");
//        } else {
//            System.out.println("Ededler beraber deyil");
//        }


//        System.out.println("3 reqemli eded daxil edin");
//        int num =scanner.nextInt();
//
//        int yuzluk = num / 100;
//        int onluq = (num / 10) %10;
//        int teklik =num % 10;
//
//        System.out.println("Ededin yuzluk mertebesi" + yuzluk);
//        System.out.println("Ededin onluq mertebesi" + onluq);
//        System.out.println("Ededin teklik mertebesi" + teklik);
//        System.out.println("Ededin reqemleri cemi" + (yuzluk + onluq + teklik) );
//        System.out.println("Ededin reqemleri ferqi" + (yuzluk - onluq - teklik));
//        System.out.println("Ededin reqemleri hasil" + (yuzluk * onluq * teklik));
    }
}
