package models;

/**
 * Interface defining rental calculations.
 */
public interface Rentable {
    double IVA = 0.19;
    double CARGO_DISCOUNT = 0.03;
    double PASSENGER_DISCOUNT = 0.07;

    /**
     * Method to calculate the rental invoice.
     * @return Total cost including IVA and discounts.
     */
    double calculateRentalInvoice();
}
