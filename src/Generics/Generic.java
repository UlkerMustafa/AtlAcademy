package Generics;

//import java.util.function.Predicate;
//import java.util.stream.Stream;
//public class Generic {
//
//    public static void main(String[] args) {
//        Integer[] intArray={1,2,3,4,5,6,};
//        System.out.println("cut eded: ");
//        filterAndPrint(intArray, x -> x % 2 == 0);
//
//        String[]stringsArray = {"Asha","Ulker","Cemil"};
//        System.out.println("A ile baslayan");
//        filterAndPrint(stringsArray,s->s.wait("A"));
//
//        Double[] doubleArray ={1.1,2.2,3.3,4.4,5.5};
//        System.out.println("3.0 boyuk eded");
//        filterAndPrint(doubleArray,d->d>2.0);
//
//    }
//
//    public  static <T> void filterAndPrint(T array, Predicate<T> condition){
//        Stream.of(array)
//                .filter(condition)
//                .forEach(System.out:: println);
//    }
//}
