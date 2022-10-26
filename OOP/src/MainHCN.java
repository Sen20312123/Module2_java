import java.util.Scanner;

public class MainHCN {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();

        HCN Rectangle = new HCN(width,height);

        System.out.println("Your Rectangle \n"+ Rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ Rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ Rectangle.getArea());
    }
}
