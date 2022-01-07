public class Customer {
    private final String customerName;
    private final RentalAccount rentalAccount;

    public Customer(String name) {
        this.customerName = name;
        this.rentalAccount = new RentalAccount();
    }

    public void displayRentalRecord() {
        System.out.println("Rental records for: " + this.customerName);
        rentalAccount.displayAccountStatement();
    }

    public void rentItem(Rental rental, int daysRent) {
        rentalAccount.rentItem(rental, daysRent);
    }
}