import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do{
            System.out.println("Nhập số năm:");
            int year = Integer.parseInt(sc.nextLine());
            boolean check = checkLeapYear(year);
            if(check){
                System.out.println(year + " là năm nhuận");
            }else {
                System.out.printf("%d không là năm nhuận",year);
            }
            boolean flagCheck = true;
            do {
                System.out.println("Bạn có muốn tiếp tục kiểm tra không: Y/N");
                String checkContinue = sc.nextLine();
                if(checkContinue.equals("N")){
                    flag = false;
                    flagCheck = false;
                }else{
                    if(checkContinue.equals("Y")){
                        flag = true;
                        flagCheck = false;
                    }else {
                        flagCheck= true;
                    }
                }

            }while (flagCheck==true);

        }while (flag==true);
        }
    public static boolean checkLeapYear(int year){
        if((year%4 == 0)&& (year%100 !=0)){
            return true;
        }else{
            if((year%100==0) && (year%400!=0)){
                return false;
            }else{
                if((year%100==0) && (year%400==0)){
                    return false;
                }else {
                    return false;
                }
            }
        }
    }
}
