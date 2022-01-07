public abstract class Movie implements Rental {

    private final String movieName;

    // Regular: 2, if days of rent greater than 2, 1.5*(daysRent-2)
    // New Release: 3*daysRent
    // Children: 1.5, if days of rent greater than 3, 1.5*(daysRent-3)

    public Movie(String movieName) {
        this.movieName = movieName;
    }

    public String getRentalItemName() {
        return this.movieName;
    }
}