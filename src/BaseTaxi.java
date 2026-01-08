abstract class BaseTaxi implements Taxi {

    private String carNumber;
    private String carName;
    private boolean isAC;
    private int seatingCapacity;
    private double averageRating;
    private double pricePerKm;
    private boolean isAvailable;
    private String mobileNumber;
    private double baseFare;
    private String fuelType;

    public BaseTaxi(
            String carNumber,
            double averageRating,
            String carName,
            boolean isAC,
            String mobileNumber,
            int seatingCapacity,
            double pricePerKm,
            String fuelType,
            int currentLocation) {
        this.carNumber = carNumber;
        this.averageRating = averageRating;
        this.carName = carName;
        this.isAC = isAC;
        this.mobileNumber = mobileNumber;
        this.seatingCapacity = seatingCapacity;
        this.pricePerKm = pricePerKm;
        this.isAvailable = true;
        this.baseFare = 0;
        this.fuelType = fuelType;
    }

    double getBaseFare() {
        return baseFare;
    }

    @Override
    public String getCarNumber() {
        return carNumber;
    }

    @Override
    public String getCarName() {
        return carName;
    }

    @Override
    public boolean isAc() {
        return isAC;
    }

    @Override
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public double getAverageRating() {
        return averageRating;
    }

    @Override
    public double getPricePerKm() {
        return pricePerKm;
    }
}
