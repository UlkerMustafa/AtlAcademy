package Stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream2 {

    public static void main(String[] args) {
        Set<String> set =new HashSet<>();
        set.add("apple");
        set.add("banan");
        set.add("pear");
        set.add("kiwi");
        set.add("orange");

        List<String> result =set.stream()
                .filter(s->s.length()>=5)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Netice: "+ result);
    }
}
