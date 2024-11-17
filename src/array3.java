import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array =new int[5];
        System.out.println("5 ededdaxil et: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("axtardigimiz eded : ");
        int target = scanner.nextInt();
        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }
        System.out.println( count + "defe " +target + " ededi 1istifade olunub");
    }
}
