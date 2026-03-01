public class DiscountCalculator {
    public static double calculateDiscount(double price, int percentage) {
        if (price <= 0 || percentage < 0) {
            return 0;
        }
        return price - (price * percentage / 100);
    }
}
