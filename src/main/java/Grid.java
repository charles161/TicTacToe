import Exceptions.BoundaryExceededException;
import Exceptions.CoordinateAlreadyMarkedException;

import java.util.HashMap;
import java.util.Map;

public class Grid {

    private final int rows;
    private final int columns;
    Map<Coordinates, Mark> cells = new HashMap<>();

    public Grid(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public void mark(Mark marking, Coordinates coordinates) throws BoundaryExceededException, CoordinateAlreadyMarkedException {
        if (!coordinates.insideBoundary(rows, columns))
            throw new BoundaryExceededException();
        if (cells.containsKey(coordinates))
            throw new CoordinateAlreadyMarkedException();
        cells.put(coordinates, marking);
    }


}
