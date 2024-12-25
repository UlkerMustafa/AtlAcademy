package TUR;

import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private List<Tour> reserveTours;

    public Customer(int customerId, List<Tour> reserveTours,String name) {
        this.customerId = customerId;
        this.reserveTours = reserveTours;
        this.name=name;
    }

    public List<Tour> getTours() {
        return reserveTours;
    }

    public void setTours(List<Tour> tours) {
        this.reserveTours = tours;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setReserveTours(Tour tour) {
        if (!tour.isReserved()) {
            tour.reserveTour();
            reserveTours.add(tour);
            System.out.println("Tour " + tour.getTourName() + " has added List");
        } else {
            System.out.println("Tour paketi reserve olunub artiq.");
        }

    }
    public void  canselReserve (Tour tour){
        if (reserveTours.contains(tour)){
            tour.canselReserve();
            reserveTours.remove(tour);
            System.out.println("Tour "+ tour.getTourName()+ "siyahinizdan silindi");
        }
        else {
            System.out.println("Artiq reserve legv olunub");
        }
    }
    public void  displayInfo (){
        System.out.println("CustomerID: "+customerId+ ", Name: "+ name+", Reserved tour: "+ reserveTours);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", reserveTours=" + reserveTours +
                '}';
    }
}
