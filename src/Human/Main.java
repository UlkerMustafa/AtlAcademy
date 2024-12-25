package Human;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Human> humanList = new ArrayList<>();

        Human human1 = new Human("Eli", LocalDate.of(2013, 06, 3), 23);
        Human human2 = new Human("Orxan", LocalDate.of(1996, 04, 12), 13);
        Human human3 = new Human("Veli", LocalDate.of(1998, 05, 21), 43);

        humanList.add(human1);
        humanList.add(human2);
        humanList.add(human3);

        Map<String, Integer> map = new HashMap<>();

//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println("Açar: " + entry.getKey() + ", Dəyər: " + entry.getValue());
//        }

        for (Human human:humanList){
            map.put(human.getName(), human.getAge());


    }
        System.out.println(map);

    }}