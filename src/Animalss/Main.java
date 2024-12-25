package Animalss;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        var animal1 =new Animal("monkey",85,160);
        var animal2 =new Animal("girafee",125,350);
        var animal3 =new Animal("donkey",90,170);

        var animalList = Arrays.asList(animal1,animal2,animal3);
        System.out.println(animalList);
        Collections.sort(animalList,new AnimalComparator());
        System.out.println(animalList);
    }
}
