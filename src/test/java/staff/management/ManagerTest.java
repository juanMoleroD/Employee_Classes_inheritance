package staff.management;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    Manager manager;

    @BeforeEach
    void setUp() {
        manager = new Manager("Rick", "NN-1234-567-A", 50000, "Finance");
    }

    @Test
    void canRaiseSalary() {
        manager.raiseSalary(5000);
        assertEquals(55000, manager.getSalary());
    }

    @Test
    void canGetBonus() {
        assertEquals(500, manager.payBonus());
    }

    @Test
    void changeName() throws Exception {
        manager.setName("Larry");
        assertEquals("Larry", manager.getName());
        manager.setName(null);
        assertEquals("Larry", manager.getName());
    }
}