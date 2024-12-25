package Human;

import java.time.LocalDate;
import java.util.Objects;

public class Human {

    private String name;
    private LocalDate britday;
    private int age;

    public Human(String name, LocalDate britday, int age) {
        this.name = name;
        this.britday = britday;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBritday() {
        return britday;
    }

    public void setBritday(LocalDate britday) {
        this.britday = britday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(britday, human.britday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, britday, age);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", britday=" + britday +
                ", age=" + age +
                '}';
    }
}
