import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        System.out.println("Nhập số tháng cần kiểm tra ");
        month = scanner.nextInt();

        switch (month){
            case 2 :
                System.out.println("Tháng " + month +" có thể có 28 hoặc 29 ngày ");
                break;
            case 1:
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10:
            case 12:
                System.out.println("Tháng "  + month + " có 31 ngày");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println( "Tháng " +month + " có 30 ngày ");
            default:
                System.out.println("không hợp lệ!");
                break;
        }

    }
}
