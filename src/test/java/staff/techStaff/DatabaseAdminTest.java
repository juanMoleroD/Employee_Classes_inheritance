package staff.techStaff;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseAdminTest {

    DatabaseAdmin admin;

    @BeforeEach
    void setUp() {
        admin = new DatabaseAdmin("Joe", "NI-1234-444-B", 40000);
    }

    @Test
    void raiseSalary() {
        admin.raiseSalary(4000);
        assertEquals(44000, admin.getSalary());
    }

    @Test
    void payBonus() {
        assertEquals(400, admin.payBonus());
    }
}