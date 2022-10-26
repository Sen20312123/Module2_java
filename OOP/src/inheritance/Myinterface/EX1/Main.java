package inheritance.Myinterface.EX1;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[5];
        shape[0] = new Circle(2);
        shape[1] = new Circle(0.5);
        shape[2] = new Rectangle(4, 5);
        shape[3] = new Square(4);
        shape[4] = new Rectangle(3, 5);
        for (Shape item : shape) {
            if (item instanceof Circle) {
                System.out.println(item);
                double percent = Math.random() * (100 - 1) + 1;
                System.out.println(percent);
                ((Circle) item).resize(percent);
                System.out.println(item);
            } else if (item instanceof Rectangle) {
                System.out.println(item);
                double percent = Math.random() * (100 - 1) + 1;
                System.out.println(percent);
                ((Rectangle) item).resize(percent);
                System.out.println(item);
            } else {
                System.out.println(item);
                double percent = Math.random() * (100 - 1) + 1;
                System.out.println(percent);
                ((Square) item).resize(percent);
                System.out.println(item);
            }
        }
    }
}
