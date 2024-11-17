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
        System.out.print("array elementlerini bir setirde cap et: ");
        for (int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+ "  ");
        }

    }}
