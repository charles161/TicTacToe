import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinatesTest {

    @Test
    void shouldReturnTrueIfInsideBoundary() {
        Coordinates coordinates1 = new Coordinates(1, 2);
        Coordinates coordinates2 = new Coordinates(2, 1);
        Coordinates coordinates3 = new Coordinates(2, 2);
        Coordinates coordinates4 = new Coordinates(3, 3);

        assertTrue(coordinates1.insideBoundary(3, 3));
        assertTrue(coordinates2.insideBoundary(3, 3));
        assertTrue(coordinates3.insideBoundary(3, 3));
        assertTrue(coordinates4.insideBoundary(3, 3));
    }

    @Test
    void shouldReturnFalseIfOutsideBoundary() {
        Coordinates coordinates1 = new Coordinates(1, 0);
        Coordinates coordinates2 = new Coordinates(0, 1);
        Coordinates coordinates3 = new Coordinates(1, 4);
        Coordinates coordinates4 = new Coordinates(4, 0);

        assertFalse(coordinates1.insideBoundary(3, 3));
        assertFalse(coordinates2.insideBoundary(3, 3));
        assertFalse(coordinates3.insideBoundary(3, 3));
        assertFalse(coordinates4.insideBoundary(3, 3));
    }
}