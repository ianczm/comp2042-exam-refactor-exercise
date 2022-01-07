public class Customer {
    private String CustName;

    public Customer(String name) {
        CustName = name;
    }

    public String statement(String movieName, String movieType, int daysRent) {
        double totalAmount = 0;
        double thisAmount = 0;
        String result = "Rental Record for " + CustName + "\n";
        if (movieType.equalsIgnoreCase("REGULAR")) {
            thisAmount += 2;
            if (daysRent > 2) thisAmount += (daysRent - 2) * 1.5;
        } else if (movieType.equalsIgnoreCase("NEW_RELEASE")) {
            thisAmount += daysRent * 3;
        } else if (movieType.equalsIgnoreCase("CHILDREN")) {
            thisAmount += 1.5;
            if (daysRent > 3) thisAmount += (daysRent - 3) * 1.5;
        }
        result += "\t" + movieName + "\t" + String.valueOf(thisAmount) + "\n";
        result += "Amount is " + String.valueOf(thisAmount) + "\n";
        return result;
    }
}