import java.util.logging.Logger;
public class DiscountCalculator {

    private static final Logger logger = Logger.getLogger("DiscountLogger");

    public static void main(String[] args) {
            double price = 100;
            int discount = 10;
            logger.info("Starting discount calculation...");
            double discountedPrice = DiscountCalculator.calculateDiscount(price, discount);
            System.out.println("Original price: " + price);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Discounted price after discount: " + discountedPrice);
    }


    public static double calculateDiscount(double price, int percentage) {
        if (price <= 0 || percentage < 0) {
            return 0;
        }
        return price - (price * percentage / 100);
    }
}
