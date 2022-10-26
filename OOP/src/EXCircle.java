public class EXCircle {
    private double radius = 1.0;
    private String color = "red";

    public EXCircle(){

    }

    public  EXCircle(double radius){
        this.radius=radius;
    }

    private double getRadius() {
        return radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    private double getArea(){
        return this.radius*this.radius * 3.14;
    }

    public static void main(String[] args) {
        EXCircle circle1 = new EXCircle(3);
        System.out.println(circle1.getArea());
    }
}
