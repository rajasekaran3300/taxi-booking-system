abstract class BaseTaxi implements Taxi{
    private String carNumber;
    private String carName;
    boolean isAC;
    int seatingCapacity;
    double averageRating;
    double pricePerkm;
    String MobileNumber;
    double baseFare;

    public BaseTaxi(String carNumber, double averageRating, String carName, boolean isAC, String mobileNumber, int seatingCapacity, double pricePerkm) {

    }

    double getBaseFare(){
        return this.baseFare;
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
    public double getAverageRating() {
        return averageRating;
    }


}
