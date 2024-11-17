import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        //array elementi  daxil edirem
        System.out.println("Array elementlərini daxil edin:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        //array elementlerini bir setirde cap et
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];

            }

        }
        System.out.println("array min element: "+min);
        System.out.println("array max element: "+max);23
    }
}
