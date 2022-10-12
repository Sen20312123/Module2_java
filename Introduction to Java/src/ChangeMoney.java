import java.util.Scanner;

public class ChangeMoney {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int vnd = 23000;
        int usa;
        System.out.println("Nhập số tiền bạn muốn đổi:");
        usa = Integer.parseInt(sc.nextLine());
        int check =convertUSAToVnd(usa,vnd);
        System.out.println("Gía trị VND :" + check);
    }
    public static int convertUSAToVnd (int usa , int vnd){
        return usa*vnd;
    }
}
