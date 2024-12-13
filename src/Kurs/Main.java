package Kurs;

public class Main {
    public static void main(String[] args) {
        Kurs<String> javaKursu = new Kurs<>("ATl");

        Telebe telebe1 = new Telebe("Ulka",1);
        Telebe telebe2 = new Telebe("Cemil",2);
        Telebe telebe3 = new Telebe("Rza",3);

        javaKursu.telebeAdd(telebe1);
        javaKursu.telebeAdd(telebe2);
        javaKursu.telebeAdd(telebe3);

        javaKursu.showTelebeler();



    }
}
