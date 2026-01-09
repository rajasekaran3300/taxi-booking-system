package service;

public interface Taxi {

    // ── Identity ──
    String getCarNumber();
    // ── Vehicle Info (customer-facing) ──
    String getCarName();
    boolean isAc();
    int getSeatingCapacity();
    // ── Availability ──
    boolean isAvailable();
    // ── Pricing Visibility ──
    double getPricePerKm();
    // ── Rating Visibility ──
    double getAverageRating();
}
