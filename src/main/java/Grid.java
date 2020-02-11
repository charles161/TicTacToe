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


    public boolean isMarkedDiagonally(Mark checkMark) {
        boolean isDiagonal = true;
        for (int i = 1; i <= rows; i++) {
            if (cells.containsKey(new Coordinates(i, i)))
                isDiagonal = cells.get(new Coordinates(i, i)).equals(checkMark) && isDiagonal;
            else {
                isDiagonal = false;
                break;
            }
        }
        return isDiagonal;
    }
}
