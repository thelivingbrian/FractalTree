package bsu.edu.btlynch;

public class Point {

    private final int xCoordinate, yCoordinate;

    public Point(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public int x() {
        return xCoordinate;
    }

    public int y() {
        return yCoordinate;
    }

}
