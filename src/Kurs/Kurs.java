package Kurs;

import java.util.ArrayList;
import java.util.List;

public class Kurs <T>{
    private T kursAdi;
    private List<Telebe> telebeler;


    public Kurs(T kursAdi) {
        this.kursAdi = kursAdi;
        this.telebeler = new ArrayList<>();
    }

    public void telebeAdd(Telebe telebe){
        telebeler.add(telebe);
        System.out.println("Telebe elave olundu " + telebe);
    }
    public void  showTelebeler(){
        System.out.println("Kurs: "+ kursAdi);
        for (Telebe telebe: telebeler){
            System.out.println(telebe);
        }
    }


}
