package Advanced_A3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account a1 = new Account("Christian", 1, 5000);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void deposit() {
        assertEquals(a1.deposit(50), true);
        assertEquals(a1.deposit(-50), false);
    }

    @Test
    void withdraw() {
        System.out.println(a1.getBalance());
        assertEquals(false, a1.withdraw(4999, 1000));
        System.out.println(a1.getBalance());
    }

    @Test
    void addInterest() {
        a1.addInterest();
        assertEquals(5000+5000*0.045f, a1.getBalance());
    }

    @Test
    void getBalance() {
        assertEquals(5000, a1.getBalance());
    }

    @Test
    void getAccountNumber() {
        assertEquals(1, a1.getAccountNumber());
    }

    @Test
    void toString1() {
    }
}