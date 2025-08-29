public class PremiumCustomer implements Discountable {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.2;
    }

}
