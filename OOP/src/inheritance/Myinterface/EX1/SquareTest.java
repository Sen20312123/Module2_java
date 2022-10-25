package inheritance.Myinterface;

public class SquareTest {
    public static void main(String[] args) {
        Square hv = new Square();
        System.out.println(hv);

        Square hv1 = new Square(2.3);
        System.out.println(hv1);

        Square hv2 = new Square(2.5, "orange", true);
        System.out.println(hv2);
    }
}
