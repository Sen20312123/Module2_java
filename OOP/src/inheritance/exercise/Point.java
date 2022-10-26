package inheritance.exercise;

public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

//    public float[] getXY() {
//        float[] arr = new float[2];
//        arr[0] = getX();
//        arr[1] = getY();
//        return arr;
//    }

    public float[] getXY(){
        float [] arr = {this.x,this.y};
        return arr;
    }

    public String convertArrayToString(float[] arr) {
        String str = "{";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            if (i == arr.length - 1) {
                str += "}";
            } else {
                str += ",";
            }
        }
        return str;
    }
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}
