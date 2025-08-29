public class WrongDiscountCalculator {

    public double calculateDiscount(final String customerType, final double amount) {
        if (customerType.equals("Regular")) {
            return amount * 0.1;
        } else if (customerType.equals("Premium")) {
            return amount * 0.2;
        } else {
            return 0;
        }
    }

    public static void main(final String[] args) {
        final var calculator = new WrongDiscountCalculator();

        final var regularDiscount = calculator.calculateDiscount("Regular", 100);
        final var premiumDiscount = calculator.calculateDiscount("Premium", 100);

        System.out.println("Regular discount: " + regularDiscount);
        System.out.println("Premium discount: " + premiumDiscount);
    }

}
