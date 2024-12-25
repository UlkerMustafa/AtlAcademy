package TUR;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        TravelAgency agency = new TravelAgency("Dream Tours");

        Tour tour1 = new Tour(1,"Sunny beach holiday",200.0,TourPackage.BEACH_HOLIDAY);
        Tour tour2 = new Tour(2,"Urban City",150.4,TourPackage.CITY_TOUR);
        Tour tour3 = new Tour(3,"Mountain Trekking",234,TourPackage.MOUNTAIN_ADVENTURE);

        agency.addTour(tour1);
        agency.addTour(tour2);
        agency.addTour(tour3);

        agency.displayTour();
        agency.addCustomer(new Customer(2, Arrays.asList(tour1,tour2),"Yusif"));
        Customer customer= new Customer(1, List.of(tour1,tour2),"semed");
        customer.displayInfo();
        agency.addCustomer(customer);
        agency.displayCustomer();
        tour1.reserveTour();
        tour1.canselReserve();
        tour2.reserveTour();


    }
}
