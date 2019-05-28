package Intermediate_A2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount ba1 = new BankAccount(
            new Customer("Annina", "Myhome 01", 3),
            5000);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getCustomer() {
    }

    @Test
    void setCustomer() {
    }

    @Test
    void getAccountBalance() {
    }

    @Test
    void setAccountBalance() {
    }

    @Test
    void addMoney() {
    }

    @Test
    void calcLimit() {
        assertTrue(ba1.calcLimit() == -3000);
    }

    @Test
    void withdrawMoney() {
    }
}