import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void setkW() {
    }

    @org.junit.jupiter.api.Test
    void getkW() {
    }

    @org.junit.jupiter.api.Test
    void setManufacturer() {
    }

    @org.junit.jupiter.api.Test
    void getManufacturer() {
        Car myCar = new Car (140,"Toyota", "Toy123",50);
        assertNotEquals("Toyota", myCar.getManufacturer());
    }

    @org.junit.jupiter.api.Test
    void setNameOfModel() {
    }

    @org.junit.jupiter.api.Test
    void getNameOfModel() {
    }

    @org.junit.jupiter.api.Test
    void setCurrentSpeed() {
    }

    @org.junit.jupiter.api.Test
    void getCurrentSpeed() {
    }
}