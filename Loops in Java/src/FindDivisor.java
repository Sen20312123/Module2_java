import java.util.Scanner;

public class FindDivisor {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a , b;
        System.out.println("Nhập a:");
        a = scanner.nextInt();
        System.out.println("Nhập b:");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }System.out.println("Greatest common factor: " + a);
    }
}
