public class NewReleaseMovie extends Movie {

    public NewReleaseMovie(String movieName) {
        super(movieName);
    }


    @Override
    public double calculateRent(int daysRent) {
        return 3 * daysRent;
    }
}