package Intermediate_A2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount ba1 = new BankAccount(
            new Customer("Annina", "Myhome 01", 5),
            5000);
    DebitCardAccount dca1 = new DebitCardAccount(
            new Customer("John", "MyHome 02", 0),
            2000);
    CreditCardAccount cca1 = new CreditCardAccount(
            new Customer("Jane", "MyHome 03", 5),
            1000);

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
        assertTrue(ba1.calcLimit() == -5000);
    }

    @Test
    void withdrawMoney() {
    }
}