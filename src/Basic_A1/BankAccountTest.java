package Basic_A1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {



    @Test
    void setAccountNumber() {
        BankAccount b1 = new BankAccount(1, "John", "Doe");
        b1.setAccountNumber(5);
        assertFalse(b1.getAccountNumber() != 1);
    }

    @Test
    void getAccountNumber() {
        BankAccount b1 = new BankAccount(1, "John", "Doe");
        assertNotEquals("John", b1.getName());
    }

    @Test
    void setName() {
        BankAccount b1 = new BankAccount(1, "John", "Doe");
        b1.setName("James");
        assertTrue(b1.getName().equals("Jumbo"));
    }

    @Test
    void getName() {
        BankAccount b1 = new BankAccount(1, "John", "Doe");
        assertEquals(5, b1.getAccountNumber());
    }

    @Test
    void setLastName() {
        BankAccount b1 = new BankAccount(1, "John", "Doe");
        b1.setLastName("Dongo");
        assertNotEquals("Dengo", b1.getLastName());
    }

    @Test
    void getLastName() {
        BankAccount b1 = new BankAccount(1, "John", "Doe");
        assertTrue(b1.getLastName().equals("Doe"));
    }
}