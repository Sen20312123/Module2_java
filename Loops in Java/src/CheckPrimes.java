import java.util.Scanner;

public class CheckPrimes {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flagReTry = true;
        do{
            System.out.println("Bạn muốn chọn chức năng nào trong bài số nguyên tố");
            System.out.println("Bài 1: Hiển thị n số nguyên tố đầu tiên (Nhập số 1)");
            System.out.println("Bài 2: Hiển thị các số nguyên tố nhỏ hơn n (Nhập số 2)");
            int action = Integer.parseInt(scanner.nextLine());
            switch (action){
                case 1:
                    first_20_primes_view();
                    break;
                case 2:
                    printPrimiterLessThanNumberView();
                    break;
            }
            boolean flagReTryContinue = true;
            do{
                System.out.println("Bạn có muốn tiếp tục hay không. Nhập Y/N");
                String actionContinue = scanner.nextLine();
                switch (actionContinue){
                    case "Y":
                        flagReTry = true;
                        flagReTryContinue = false;
                        break;
                    case "N":
                        flagReTry = false;
                        flagReTryContinue = false;
                        break;
                    default:
                        flagReTryContinue = true;
                        break;
                }
            }while (flagReTryContinue==true);
        }while (flagReTry);
    }

    public static boolean checkPrimes(int number) {
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void checkPrimesView() {
        System.out.println("Nhập số bạn muốn kiểm tra: ");
        int n = Integer.parseInt(scanner.nextLine());
        if (checkPrimes(n) == true) {
            System.out.println("Là số nguyên tố ");
        } else {
            System.out.println("không phải số nguyên tố ");
        }
    }

    public static String first_20_primes(int numbers) {
        String str = "";
        int i = 2;
        int count = 0;
        while (count <= numbers) {
            boolean check = checkPrimes(i);
            if (check == true) {
                count++;
                str += i + " ";
            }
            i++;
        }
        return str;
    }
    public static void first_20_primes_view (){
        System.out.println("Nhập số lượng số nguyên tố bạn muốn kiểm tra: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(first_20_primes(number));
    }
    public static String printPrimiterLessThanNumber(int number){
        int i = number-1;
        String str = "";
        while (i >= 2){
            boolean checkPrimiter = checkPrimes(i);
            if (checkPrimiter==true){
                str += i + " ";
            }
            i--;
        }
        return str;
    }
    public static void printPrimiterLessThanNumberView (){
        System.out.println("Bạn muốn tìm các số nguyên tố nhỏ hơn bao nhiêu? Vui lòng nhập!");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(printPrimiterLessThanNumber(number));
    }
    private static boolean isReTryYesNoCountinue(){
        boolean flagReTryContinue = true;
        do{
            System.out.println("Bạn có muốn tiếp tục hay không. Nhập Y/N");
            String actionContinue = scanner.nextLine();
            switch (actionContinue){
                case "Y":
                    flagReTryContinue = false;
                    break;
                case "N":
                    flagReTryContinue = false;
                    break;
                default:
                    flagReTryContinue = true;
                    break;
            }
        }while (flagReTryContinue);
        return flagReTryContinue;

    }
}
