import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class MoneyLend {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double money ;
        int month ;
        double interestRate ;
        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();
        System.out.println("Enter number of months: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = scanner.nextDouble();
        double totalInterest = 0;
            totalInterest += money * (interestRate/100)/12 * month;
        NumberFormat formater = new DecimalFormat("###,###.###");
        System.out.println("Total of interest: " + formater.format(totalInterest) );
    }
}
