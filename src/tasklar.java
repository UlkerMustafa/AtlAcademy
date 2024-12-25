import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class tasklar {
    public static void main(String[] args) {

/*        scanerle eded daxil edirem.yene scaneerle reqem daxil
 edib.eded icinde reqemin sayinin nece tapa bilerem
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("eded daxil edin: ");
        var number = scanner.nextInt();
        System.out.println("eded daxil edin: ");
        int digit= scanner.nextInt();
        var count =0;
        while (number >0){
          int lastDigit=number%10;

           if (lastDigit==digit){
               count++;

           }number/=10;

        }
        System.out.println(count);}}




















//        int num =scanner.nextInt();
//        int say=0;
//        for (int i=1; i<=num; i++) {
//            if (num % i == 0) {
//                System.out.println(i);
//                say++;
//
//            }
//
//        }
//        System.out.println(say +" boleni var");
//
//









//        Scanner scanner = new Scanner(System.in);
//        System.out.println("pascal ucbucaq seviyyesi");
//        int levels = scanner.nextInt();
//        for (int i = 0; i < levels; i++) {
//            for (int j = 0; j < levels - i; j++) ;
//            System.out.print("");
//            int num = 1;
//            for (int j = 0; j <= i; j++) {
//                System.out.print(num + " ");
//                num = num * (i - j) / (j + 1);
//        }
//            System.out.println();
//        }


















//for ( int j=1; j<5; j++){
//    System.out.print("*");
//    for (int i=0;i<4;i++){
//        System.out.print(" ");
//    }
//
//
//    System.out.print("*");
//    System.out.println();


//











//        for ( int i=1; i<5;i++){
//            for (int j=0; j<1; j++){
//                System.out.print("*" + "      "+"*" );
//            }
//            System.out.println();
//        }




//        for (int i = 1; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }


//       String  netice1 ="";
//       String netice2= "";
//       for ( int i=0; i<=4; i++){
//           netice1 = "#";
//           netice2 = "*";
//
//
//           System.out.println(netice1);
//           System.out.println(netice2);
//       }


