public class Coordinates {
    int x;
    int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean insideBoundary(int rows, int columns) {
        return x<=rows && y<=columns && x>0 && y>0;
    }
}
