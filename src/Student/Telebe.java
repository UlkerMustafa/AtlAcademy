package Student;

import java.time.LocalDate;
import java.time.Period;

class Telebe {
    String ad;
    LocalDate dogumTarixi;

    public Telebe(String ad, LocalDate dogumTarixi) {
        this.ad = ad;
        this.dogumTarixi = dogumTarixi;
    }
    public int yasHesablama (){
        return Period.between(this.dogumTarixi,LocalDate.now()).getYears();


    }
    @Override
    public  String toString(){
        return "Ad: " +ad+ "Dogum tarixi: "+ dogumTarixi;
    }
}
