package by.blinov.chapter_4.examples.point;

public class Point2D extends Point1D {
    public int y;

    public Point2D(int x, int y) {
        super(x);
        this.y = y;
    }

    @Override
    public double lenght() {
        return Math.hypot(super.lenght(), y);
    }

    @Override
    public String toString() {
        return super.toString() + " y=" + y;
    }
}
