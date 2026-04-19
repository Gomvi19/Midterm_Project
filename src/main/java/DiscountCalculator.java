import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class DiscountCalculator {

    private static final Logger logger = LogManager.getLogger(DiscountCalculator.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userId = "user123";
        String sessionId = "sessionABC";

        logger.info("Starting calculation | userId={} sessionId={}", userId, sessionId);

        try {
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();

            System.out.print("Enter discount (%): ");
            int discount = scanner.nextInt();

            logger.info("User input received | price={} discount={} userId={} sessionId={}",
                    price, discount, userId, sessionId);

            double discountedPrice = calculateDiscount(price, discount, userId, sessionId);

            logger.info("Calculation complete | originalPrice={} discount={} finalPrice={} userId={} sessionId={}",
                    price, discount, discountedPrice, userId, sessionId);

            System.out.println("Discounted price: " + discountedPrice);

        } catch (Exception e) {
            logger.error("Invalid input type entered | userId={} sessionId={}", userId, sessionId);
            System.out.println("Invalid input. Please enter numeric values.");
        }

        scanner.close();
    }

    public static double calculateDiscount(double price, int percentage, String userId, String sessionId) {
        if (price <= 0 || percentage < 0) {
            logger.error("Invalid input detected | price={} discount={} userId={} sessionId={}",
                    price, percentage, userId, sessionId);
            return 0;
        }

        return price - (price * percentage / 100);
    }
}