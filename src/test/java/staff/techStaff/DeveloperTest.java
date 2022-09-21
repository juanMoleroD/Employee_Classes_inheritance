package staff.techStaff;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {

    Developer dev;

    @BeforeEach
    void setUp() {
        dev = new Developer("Robert", "FE-0987-234-S", 45000);
    }

    @Test
    void raiseSalary() {
        dev.raiseSalary(10000);
        assertEquals(55000, dev.getSalary());
    }

    @Test
    void payBonus() {
        assertEquals(450, dev.payBonus());
    }
}