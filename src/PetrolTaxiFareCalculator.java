public class PetrolTaxiFareCalculator {

    public static double calculateBaseFair(PetrolTaxi taxi, int kmDriven , double specialCharge) {
        return taxi.getBaseFare() + (taxi.getPricePerKm() * kmDriven) +specialCharge;
    }
}
