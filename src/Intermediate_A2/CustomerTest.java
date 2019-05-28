package Intermediate_A2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getName() {
        BankAccount a1 = new BankAccount(new Customer("Annina", "Home01", 5), 5000.00);
        assertNotEquals("Benjamin", a1.getCustomer().getName());
    }

    @Test
    void setName() {
    }

    @Test
    void getAdress() {
    }

    @Test
    void setAdress() {
    }

    @Test
    void getCreditScore() {
    }

    @Test
    void setCreditScore() {
    }
}