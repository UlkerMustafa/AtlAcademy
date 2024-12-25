package TUR;

public class Tour {
    private int tourId;
    private String tourName;
    private double price;
    private boolean isReserved;
    private TourPackage tourPackage;

    public Tour(int tourId, String tourName, double price, boolean isReserved, TourPackage tourPackage) {
        this.tourId = tourId;
        this.tourName = tourName;
        this.price = price;
        this.isReserved = isReserved;
        this.tourPackage = tourPackage;
    }

    public Tour(int tourId, String sunnyBeachHoliday, double price, TourPackage tourPackage) {
    }

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }

    public void reserveTour() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Tour " + tourName + " has been reserved.");
        } else {
            System.out.println("Tour " + tourName + " is already reserved.");
        }
    }

    public void canselReserve() {
        if (!isReserved) {
            isReserved = false;
            System.out.println("Reservation for tour " + tourName + " ");
        } else {
            System.out.println("Tour " + tourName + " is not reserved yet.");
        }
    }

    public void displayInfo() {
        System.out.println("Tour ID: " + tourId + "Tour Name: " + tourName + "Price: " + price + "Reserved: " + (isReserved ? "Yes" : "No") + "Package: " + tourPackage);

    }
}
