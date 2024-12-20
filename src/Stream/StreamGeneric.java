package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamGeneric {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, -3, 12, 18, -1, 7, 25, 8, 2);
//        processAndPrint(numbers);
        streamMetod(numbers);


    }


//    public static <T extends Number> void processAndPrint(List<T> list) {

    public static <T extends  List<Integer>>void  streamMetod(T list){
        list.stream()
//                .map(Number::doubleValue)                 //ededleri double ceviririk
                .filter(n -> n > 0)                            //musbet ededleri secir
                .map(n -> n * 2)                               //her bir eded 2 qat artit
                .filter(n -> n > 10)                           //10 dan boyuk olanlari sec
                .sorted()
                .toList()
                .forEach(System.out::println);
    }


               //her bir elemendi cap edir

}
