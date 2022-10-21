public class QuadraticEquation {
    private double a;
    private double b;
    private double c;


    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double discriminant = this.b * this.b - 4 * this.a * this.c;
        return discriminant;
    }

    public double getRoot1() {
        double x1 = ((-this.b) + Math.pow(this.getDiscriminant(), 0.5)) / 2 * this.a;
        return x1;
    }

    public double getRoot2() {
        double x2 = ((-this.b) - Math.pow(this.getDiscriminant(), 0.5)) / 2 * this.a;
        return x2;
    }

    public double getRoot12() {
        double x12 = (-this.b) / 2 * this.a;
        return x12;
    }

    public String getRoot() {
        if (getDiscriminant() > 0) {
            return "Phương trình có 2 nghiệm phân biệt: x1 = " + getRoot1() + ". x2 = " + getRoot2();
        } else if (getDiscriminant() == 0) {
            return "Phương trình có nghiệm kép x1 = x2 = " + getRoot12();
        } else {
            return "Phương trình vô nghiệm";
        }
    }
}