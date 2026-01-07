import java.util.Objects;

public class PetrolTaxi extends BaseTaxi{
    double kmPerHour;
    boolean isAvailable;

    public PetrolTaxi(String carNumber, double averageRating, String carName, boolean isAC, String mobileNumber, int seatingCapacity, double pricePerkm) {
        super(carNumber, averageRating, carName, isAC, mobileNumber, seatingCapacity, pricePerkm);
    }

    public double calculateFare(int kmDriven){
        return getBaseFare() +((kmDriven*kmPerHour)+100);
    }

    public void setFairByKm() {
        PetrolTaxiFareCalculator.calculateBaseFair(this);
    }

    @Override
    public double getPricePerKm() {
        return kmPerHour;
    }


    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString(){
        return "";
    }
}
