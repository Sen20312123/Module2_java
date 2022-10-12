import java.util.Scanner;

public class HCN {
    public static void main(String[] args) {
        float width , height , S;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng:");
        width = scanner.nextFloat();
        System.out.println("Nhập chiều cao:");
        height = scanner.nextFloat();
        S = width * height ;
        System.out.println("Diên tích hình chữ nhật là : " + S);
    }
}
