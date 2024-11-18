import java.util.Scanner;

public class MetodTasks {
    public static String reverseString(String name) {
        StringBuilder reversed = new StringBuilder(name);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adınızı daxil edin: ");
        String name = scanner.nextLine();
        String reversedName = reverseString(name);
        System.out.println("Adınızın tərsi: " + reversedName);
    }
}
