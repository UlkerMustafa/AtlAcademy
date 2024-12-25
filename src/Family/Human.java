package Family;

public class Human {
    private String name;
    private String surname;
    private int age;
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Human(String name, String surname, int age, Human mother, Human father, Human[] children, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
