public class MainApp {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Tan");

        Movie ironManMovie = new RegularMovie("Iron Man");
        customer1.rentItem(ironManMovie, 5);

        Movie toyStory3 = new ChildrenMovie("Toy Story 3");
        customer1.rentItem(toyStory3, 10);

        Movie matrixResurrections = new NewReleaseMovie("Matrix Resurrections");
        customer1.rentItem(matrixResurrections, 6);

        customer1.displayRentalRecord();
    }
}