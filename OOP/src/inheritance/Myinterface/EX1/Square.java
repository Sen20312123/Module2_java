package inheritance.Myinterface;

public class Square extends Shape implements Resizeable{
    private double a ;
    private double b = a;

    public Square(){

    }

    public Square(double a){
        this.a = a;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Square(double a, String color, boolean filled) {
        super(color, filled);
        this.a = a;
    }
    public double getArea() {
        return a * this.b;
    }
    public double getPerimeter() {
        return 4 * this.a;
    }
    public String toString() {
        return "A Square with width="
                + getA()
                + " and length="
                + getA()
                + ", which is a subclass of "
                + super.toString();
    }
    public void resize(double percent){
        this.a = a * (100 + percent) / 100;
    }
}
