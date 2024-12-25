public class Cat {

    public String name;


    //constraktir;--
    public Cat(String name) {
        this.name = name;

    }

    public static void main(String[] args) {
        Cat myCat = new Cat("luna");
        System.out.println(myCat.name);
    }
}

