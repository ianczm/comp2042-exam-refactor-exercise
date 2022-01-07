public class ChildrenMovie extends Movie {

    public ChildrenMovie(String movieName) {
        super(movieName);
    }


    @Override
    public double calculateRent(int daysRent) {
        double rent;

        if (daysRent <= 3) {
            rent = 1.5;
        } else {
            rent = (daysRent - 3) * 1.5;
        }

        return rent;
    }
}