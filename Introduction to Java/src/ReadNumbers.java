import java.util.Scanner;

public class ReadNumbers {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập số:");
        int i = Integer.parseInt(scanner.nextLine()) ;
            System.out.print(i + " ");
            output(i);

            System.out.println();

    }

    public static String _1_to_9(int a) {
        String result = "";
        switch (a) {
            case 0:
                result = "zero";
                break;
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
            case 10:
                result = "ten";
            default:
                break;
        }
        return result;
    }

    public static String _10_to_29(int b, int c) {
        String result = "";
        if (b == 2) {
            result = "twenty" + space();
            result += c == 0 ? "" : _1_to_9(c); // neu co he so phia sau thi goi lai ham 21 la twenty one;
            return result; // neu b = 2 thi tra ngay tai day
        } else {
            if (c == 1) {
                result = "eleven"; // b = 1 , c = 1
            } else if (c == 2) {
                result = "twelve";
            } else if (c == 3) {
                result = "thirteen";
            } else if (c == 5) {
                result = "fifteen";
            } else if (c == 8) {
                result = "eighteen";
            } else {
                result = _1_to_9(b) + "teen";
            }
        }
        return result;
    }


    public static String _30_to_99(int b, int c) {
        String result = "";
        if (b == 3) {
            result = "thirty";
        } else if (b == 5) {
            result = "fifty";
        } else if (b == 8) {
            result = "eighty";
        } else {
            result = _1_to_9(b) + "ty";
        }
        result += space() + _1_to_9(c);

        return result;
    }

    public static String _100_to_900(int a) {
        if (a == 0)
            return "";
        return _1_to_9(a) + " hundered";
    }

    public static void output(int n) {

        if (n < 10) {
            System.out.println(_1_to_9(n));
            return;
        }
        if (n == 10) {
            System.out.println("ten");
            return;
        }

        int c = n % 10;
        int b = n / 10 % 10;
        int a = n / 100;

        String result = "";

        result = _100_to_900(a) + space();
        if (b == 0) {
            result += "and" + space() + _1_to_9(c);
        } else {

            if (b < 3) {
                result += "and " +_10_to_29(b, c);
            } else {
                result += "and " + _30_to_99(b, c);
            }
        }

        System.out.println(result);
    }

    public static String space() {
        return " ";
    }


}




