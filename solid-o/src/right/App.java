public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando");

        final var amount = 100;

        final var regularCustomer = new RegularCustomer();
        final var premiumCustomer = new PremiumCustomer();

        final var calculator = new DiscountCalculator();

        final var regularDiscount = calculator.calculateDiscount(regularCustomer, amount);
        final var premiumDiscount = calculator.calculateDiscount(premiumCustomer, amount);

        System.out.println("Regular: " + regularDiscount);
        System.out.println("Premium: " + premiumDiscount);
    }

}
