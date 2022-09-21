package staff.management;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectorTest {

    Director director = new Director(
            "Dick", "RR-4321-123-F", 100000, "Finance", 2000000);

    @Test
    void payBonus() {
        assertEquals(2000, director.payBonus());

    }
}