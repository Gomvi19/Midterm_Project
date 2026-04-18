import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class DiscountCalculator {

    private static final Logger logger = LogManager.getLogger(DiscountCalculator.class);

    public static void main(String[] args) {
            double price = 100;
            int discount = 10;
            String userId = "user123";
            String sessionId = "sessionABC";
            logger.info("Starting calculation | userId={} sessionId={}", userId, sessionId);
            logger.info("Starting discount calculation...");
            double discountedPrice = DiscountCalculator.calculateDiscount(price, discount);
            logger.info("Calculation complete | originalPrice={} discount={} finalPrice={} userId={} sessionId={}",
                price, discount, discountedPrice, userId, sessionId);
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
