package inheritance.exercise;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {
    }

    public Point3D(float z) {
        super();
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ(){
        float [] arr = {super.getX(),super.getY(),getZ()};
        return arr;
    }

    public String toString() {
        return "tọa độ x,y,z là = " + convertArrayToString(getXYZ());
    }
}
