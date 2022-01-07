public class RegularMovie extends Movie {

    public RegularMovie(String movieName) {
        super(movieName);
    }


    @Override
    public double calculateRent(int daysRent) {

        double rent;

        if (daysRent <= 2) {
            rent = 2;
        } else {
            rent = (daysRent - 2) * 1.5;
        }

        return rent;
    }
}