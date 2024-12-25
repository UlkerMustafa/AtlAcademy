package Exception;

import java.util.Scanner;

public class EkseptionTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir eded daxil edin");
        String input = scanner.nextLine();
        Integer number = null;
        try {
            if (! input.trim().isEmpty()){
                number=Integer.parseInt(input);
            }}
        catch (NumberFormatException e) {
            System.out.println("yanlis formada reqem daxil olub");
        }

            if (number == null) {
                System.out.println("bosluq ola bilmez");
            }
            else  {
                System.out.println("daxil edilen reqem; " + number);
            }



        }    }
