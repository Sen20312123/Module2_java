import java.util.Scanner;

public class MenuImprove {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = -1;
        while(choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập chiều cao:");
                    int height = scanner.nextInt();
                    System.out.println("Nhập chiều dài:");
                    int weight = scanner.nextInt();
                    printTheRectangle(height,weight);
                    break;
                case 2:
                    System.out.println("Nhập chiều cao:");
                    int height1 = scanner.nextInt();
                    PrintTheSquareTriangle(height1);
                    break;
                case 3:

                    System.out.println("Nhập chiều dài:");
                    int weight1 = scanner.nextInt();
                    PrintIsoscelesTriangle(weight1);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
    public static String printTheRectangle( int height , int weight){
        System.out.println("Print the rectangle"); // hinh chu nhat

        String result = "";
        for (int i = 0; i < height ; i++){
            for (int j = 0 ; j <= weight ;j++){
                result += "*" + " ";
            }
            System.out.println(result);
            result="";
        }return result;
    }
    public static String PrintTheSquareTriangle(int height){
        System.out.println("Print the square triangle"); // hinh tam giac vuong
        String result = "";
        for (int i = 1; i <= height; i++) {
                result += "*" + " ";
            System.out.println(result);
        }return result;
    }
    public static String PrintIsoscelesTriangle(int weight){
        System.out.println("Print isosceles triangle"); // tam giac can
        String result = "";
        int k = 0;
        for (int i = 1; i <= weight; i++, k = 0) {
            for (int j = 1; j <= weight - i; j++) {
                System.out.print("  ");
            }
            while (k != 2 * i -1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }return result;
    }
}
