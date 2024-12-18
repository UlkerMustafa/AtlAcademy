package Stream;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(34);
        list.add(44);
        list.add(56);

        List<Integer> result = list.stream()
                .filter(n->n%2==0)
                .map(n->n*2)
                .filter(n->n>20)
                .sorted()
                .collect(Collectors.toList());


        System.out.println("Netice: " + result);
    }


}
