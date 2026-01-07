public class PetrolTaxiFareCalculator {

    public static double calculateBaseFair(PetrolTaxi taxi) {
        return taxi.baseFare +((taxi.getPricePerKm()*taxi.kmPerHour) +100);
    }
}
