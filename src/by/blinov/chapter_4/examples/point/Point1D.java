package by.blinov.chapter_4.examples.point;

public class Point1D {
    public int x;

    public Point1D(int x) {
        this.x = x;
    }

    public double lenght() {
        return Math.abs(x);
    }

    @Override
    public String toString() {
        return " x=" + x;
    }
}
