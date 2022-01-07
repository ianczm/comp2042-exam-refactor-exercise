import java.util.ArrayList;

public class RentalAccount implements CanMakeRentals {

    private double totalRent;
    private final ArrayList<RentalRecord> rentals;

    public RentalAccount() {
        this.totalRent = 0;
        this.rentals = new ArrayList<>();
    }

    public void displayAccountStatement() {
        for(RentalRecord rental: this.rentals) {
            System.out.println("Item: " + rental.getRentalItemName() + ", Price: " + rental.getRentalCost());
        }
        System.out.println("Total Rent: " + getTotalRent());
    }

    private void appendToRecord(RentalRecord movie) {
        this.rentals.add(movie);
    }

    private void updateTotalRent() {
        this.totalRent = 0;

        for(RentalRecord rental: this.rentals) {
            this.totalRent += rental.getRentalCost();
        }
    }

    public double getTotalRent() {
        return this.totalRent;
    }

    @Override
    public void rentItem(Rental rental, int daysRent) {
        appendToRecord(new RentalRecord(rental, daysRent));
        updateTotalRent();
    }
}
