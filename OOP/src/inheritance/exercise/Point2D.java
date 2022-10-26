package inheritance.exercise;

public class Point2D {
    private float x = 1;
    private float y = 1;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
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
    public float[] getXY(){
        float [] arr = {this.x,this.y};
        return arr;
    }
    public String convertArrayToString(float[] arr){
        String str = "{";
        for(int i = 0;i<arr.length;i++){
            str +=  arr[i];
            if(i==arr.length-1){
                str += "}";
            }else{
                str += ",";
            }
        }
        return str;
    }


    public String toString() {
        return "tọa độ x,y là = " + convertArrayToString(getXY());
    }
}
