import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;
        System.out.println(" array elementleri daxil et: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        double average =(double)  sum / array.length;

        System.out.println("sum: " + sum);
        System.out.println("average: " + average);
    }
    }

