// One improvement: The calculateDiscount method could handle invalid inputs more specifically,
// for example by throwing an exception or returning a clear error value instead of always returning 0.

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Compute Normal Case")
    void calculateNormalCase() {
        double expected = 90;
        assertEquals(expected, DiscountCalculator.calculateDiscount(100,10),"Calculation is incorrect");
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Compute Extreme Case")
    void calculateExtremeCase() {
        double expected = 0;
        assertEquals(expected, DiscountCalculator.calculateDiscount(100,100),"Calculation is incorrect");
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Compute Invalid Price Case")
    void calculateInvalidPriceCase() {
        double expected = 0;
        assertEquals(expected, DiscountCalculator.calculateDiscount(-10,90),"Calculation is incorrect");
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Compute Invalid Percentage Case")
    void calculateInvalidPercentageCase() {
        double expected = 0;
        assertEquals(expected, DiscountCalculator.calculateDiscount(100,-90),"Calculation is incorrect");
    }
}