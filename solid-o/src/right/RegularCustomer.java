public class RegularCustomer implements Discountable {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.1;
    }

}
