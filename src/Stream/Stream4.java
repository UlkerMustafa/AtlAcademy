package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream4 {
    public static void main(String[] args) {


        List<List<Integer>> myList= Arrays.asList(
                Arrays.asList(12,23,34),
                Arrays.asList(45,56,78),
                Arrays.asList(33,567,777)

        );
        myList.stream()
                .map(s->s.stream().toList())
                .collect(Collectors.toList())
                .forEach(System.out::println);



        List<Integer> result=myList.stream()
                .flatMap(a->a.stream())
                .toList();
        System.out.println(result);


    }


}
