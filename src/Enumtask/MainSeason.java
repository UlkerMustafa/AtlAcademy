package Enumtask;

public class MainSeason {
    public static void main(String[] args) {
       for (Season season : Season.values()){
           System.out.println(season.getFormatInfo());
       }
    }
}
