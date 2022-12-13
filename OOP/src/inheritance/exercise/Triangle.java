package inheritance.exercise;

public class Triangle extends Shape{
    private  double width ;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Triangle(double side1, double side2, double side3, double width, double height) {
        super(side1, side2, side3);
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return  this.height*this.width;
    }

    public double getPerimeter(){
        return this.height*this.width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
