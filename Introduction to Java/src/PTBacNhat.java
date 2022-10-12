import java.util.Scanner;

public class PTBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a , b  ;
        System.out.println("Nhập a:");
        a = Integer.parseInt(scanner.nextLine()) ;
        System.out.println("Nhập b");
        b = Integer.parseInt(scanner.nextLine());


        if (a != 0) {
            int answer =  - b / a;
            System.out.println("Phương trinh có 1 nghiệm:" + answer);
        } else {
            if (b == 0) {
                System.out.print(" Vô số nghiệm !");
            } else {
                System.out.print("Vô nghiệm!");
            }
        }
    }

}
