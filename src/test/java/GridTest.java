import Exceptions.BoundaryExceededException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class GridTest {
    @Test
    void shouldBeAbleToMarkOnAGridWithinBoundaries() {
        Grid grid = new Grid(3, 3);
        try {
            grid.mark(Mark.X, new Coordinates(1, 1));
        } catch (Exception e) {
            fail("Boundary Limit exceeded");
        }
    }

    @Test
    void shouldThrowAnExceptionWhenBoundaryExceededWhenCoordinatesAre4And4() {
        Grid grid = new Grid(3, 3);
        assertThrows(BoundaryExceededException.class, () -> grid.mark(Mark.X, new Coordinates(4, 4)));
    }

    @Test
    void shouldThrowAnExceptionWhenBoundaryExceededWhenCoordinatesAre0and0() {
        Grid grid = new Grid(3, 3);
        assertThrows(BoundaryExceededException.class, () -> grid.mark(Mark.X, new Coordinates(0, 0)));
    }
}