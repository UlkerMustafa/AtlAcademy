package Enumtask;

public enum Season {
    SUMMER (30 ,45,"Isti olur"),
    AUTUMN(20,28,"Soyuq olur"),
    WINTER(29,-10,"Shaxtali olur"),
    SPRING(25,30,"Ara-sira gunesli");

    private final int mintemp;
    private final int maxtemp;
    private final String description;

    Season(int mintemp, int maxtemp, String description) {
        this.mintemp = mintemp;
        this.maxtemp = maxtemp;
        this.description = description;
    }

    public int getMintemp() {
        return mintemp;
    }

    public int getMaxtemp() {
        return maxtemp;
    }

    public String getDescription() {
        return description;
    }
  public String getFormatInfo (){
        return String.format("%s: Minimum temperatur %d C,Maxsimum temperatur %d C, %s",
                this.name(), mintemp,maxtemp,description );

  }

}
