package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream3 {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("alma","armud","heyva");


//List<List<String>> splitLetters=stringList.stream()
//        .map(s->Arrays.asList(s.split("")))
//        .collect(Collectors.toList());
//        System.out.println(splitLetters);


        stringList.stream()
                .map(a->a.split(""))
                .toList()
                .forEach(System.out::println);

List<String> result =stringList.stream()
                .flatMap(a->Arrays.stream(a.split("")))
        .toList();
        System.out.println(result);




    }
}
