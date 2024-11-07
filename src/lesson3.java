import java.util.Scanner;

public class lesson3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Istifadeci adi: ");

         var username= "admin";
         var name = scanner.next();
         if (name.equals(username)){
             System.out.println("yes");
         }
         else {
             System.out.println("no");
         }

    }
}
