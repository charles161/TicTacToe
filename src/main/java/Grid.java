import Exceptions.BoundaryExceededException;

public class Grid {

    private final int rows;
    private final int columns;

    public Grid(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public void mark(Mark x, Coordinates coordinates) throws BoundaryExceededException {
        if(!coordinates.insideBoundary(rows,columns))
            throw new BoundaryExceededException();
    }
}
