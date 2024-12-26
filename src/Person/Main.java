package Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Phone>phoneList=new ArrayList<>();
        phoneList.add(new Phone("055-233-44-01"));
        phoneList.add(new Phone("055-123-34-02"));
        phoneList.add(new Phone("055-233-44-03"));
        phoneList.add(new Phone("055-123-34-04"));



        List<Phone>phoneList2=new ArrayList<>();
        phoneList2.add(new Phone("055-233-44-11"));
        phoneList2.add(new Phone("055-123-34-12"));
        phoneList2.add(new Phone("055-233-44-13"));
        phoneList2.add(new Phone("055-123-34-14"));

     List<Person>persons =new ArrayList<>();
     persons.add(new Person("ELI",phoneList));
     persons.add(new Person("VELI",phoneList2));

        List<String> allPhoneNumbers =persons.stream()
                .flatMap(person -> person.getPhoneNumbers().stream())
                .map(Phone::getNumber).toList();
        System.out.println("butun telefon nomreleri");
        allPhoneNumbers.forEach(System.out::println);
    }
}
