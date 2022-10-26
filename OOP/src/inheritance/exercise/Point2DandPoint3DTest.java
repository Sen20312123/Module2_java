package inheritance.exercise;

public class Point2DandPoint3DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(4,4);
        System.out.println(point2D);
        Point3D point3D = new Point3D();
        point3D.setXYZ(4,5,6);
        System.out.println(point3D);

    }
}
