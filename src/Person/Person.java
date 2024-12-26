package Person;

import java.util.List;

public class Person {

  private  String name;
    private List<Phone> phoneNumbers;

    public Person(String name, List<Phone> phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public List<Phone> getPhoneNumbers() {
        return phoneNumbers;
    }
}
