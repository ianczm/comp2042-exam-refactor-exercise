public class RentalRecord {

    private final Rental rental;
    private final int daysRent;
    private double rentalCost;

    public RentalRecord(Rental rental, int daysRent) {
        this.rental = rental;
        this.daysRent = daysRent;
        updateRent();
    }

    public void updateRent() {
        this.rentalCost = rental.calculateRent(daysRent);
    }

    public double getRentalCost() {
        return this.rentalCost;
    }

    public String getRentalItemName() {
        return rental.getRentalItemName();
    }
}