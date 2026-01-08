public class PetrolTaxi extends BaseTaxi {
    private double specialCharge;
    private int currentLocation;

    public PetrolTaxi(
            String carNumber,
            double averageRating,
            String carName,
            boolean isAC,
            String mobileNumber,
            int seatingCapacity,
            double pricePerKm,
            String fueType,
            double specialCharge,
            int currentLocation
    ) {
        super(carNumber, averageRating, carName, isAC, mobileNumber, seatingCapacity, pricePerKm, fueType,currentLocation);
        this.specialCharge = specialCharge;
        this.currentLocation = currentLocation;
    }

    @Override
    public String toString() {
        return "Taxi {" +
                "carNumber ='" + getCarNumber() + '\'' +
                ", carName ='" + getCarName() + '\'' +
                ", AC =" + isAc() +
                ", seatingCapacity =" + getSeatingCapacity() +
                ", pricePerKm =" + getPricePerKm() +
                ", rating =" + getAverageRating() +
                ", available =" + isAvailable() +
                ", FuelType = " + "Petrol" +
                '}';
    }
}

