package by.blinov.chapter_4.examples.point;

public class Point3DCreator extends Point2DCreator {
    @Override
    public Point3D createPoint() {
        System.out.println("Point3D");
        return new Point3D(3, 7, 8);
    }
}
