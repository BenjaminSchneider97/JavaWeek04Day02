package Advanced_A3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadMoneyTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
        float originalPrice = 400000.00f;
        float reducedPrice = originalPrice - 0.05f;
        float discount = originalPrice - reducedPrice;
        assertEquals(0.05, discount);
    }
}