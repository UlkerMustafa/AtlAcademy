package Binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        int[] arr = new int[1,2,3,4,5,6,7];
        int length = arr.length;
        int step =0;
        int mid= arr.length / 2;
        int find =3;

        for (int i=0; i< length; ++i){
            if (find > arr[mid]) {
                ++step;
                i=mid +1;
                mid=(mid+length)/2;

            } else if (find < arr[mid]) {
                ++step;
                length=mid-1;
                mid=length/2;
            }
            else{
                ++step;
                System.out.println(i);
            }
        }

















//    int arr[]= new int[]{23,45,56,67,78,89};
//
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("ededi daxil edin");
//        int eded= scanner.nextInt();
//
//    }
//    public static void binarySearch{
//
//        for ()
    }
}
