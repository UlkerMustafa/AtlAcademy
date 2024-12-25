package LinkedList;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<>();
        list.add("Asha");
        list.add("Ulker");
        list.add("Cemil");
        list.add("Elovset");
        list.add("Si");

        String longest= list.get(0);
        for (String str :list) {
            if (str.length()>longest.length()){
                longest=str;
            }
        }
        System.out.println("en uzun setir: "+longest);
    }
}
