public class mainApp {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Tan");
        System.out.println(customer1.statement("Iron Man", "REGULAR", 5));
    }
}