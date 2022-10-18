import java.util.Scanner;

public class Array2D {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }
    public static void sumArray(){
        int [][] arr = inputArray2();
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("Tổng mảng 2 chiều là :" + sum);
    }
    public static void launch(){
        int action;
        do {
            System.out.println("Bài 1: Nhập và in ma trận.");
            System.out.println("Bài 2: Tính tổng các số chẵn trong ma trận.");
            System.out.println("Bài 3: Tính tổng các số trên đường chéo chính.");
            System.out.println("Bài 4: In ra tam giác trái trên.");
            System.out.println("Bài 5: In ra tam giác trái dưới.");
            System.out.println("Bài 6: In ra tam giác phải trên.");
            System.out.println("Bài 7: Tính tổng tam giác trái trên.");
            System.out.println("Bài 8: In ra tam giác phải dưới.");
            System.out.println("Bài 9: Tính tổng tam giác phải dưới.");
            System.out.println("Bài 10:In ra các số nằm trên đường viền của ma trận.");
            System.out.println("Lưu ý : Nhập số 0 nếu bạn muốn thoát.");
            System.out.print("Nhập số: ");
            action = Integer.parseInt(scanner.nextLine());
            switch (action){
                case 1 :
                    System.out.println("Bài 1. Nhập và in ma trận");
                    printArray2View();
                    break;
                case 2 :
                    System.out.println("Bài 2: Tính tổng các số chẵn trong ma trận");
                    totalEvenArray2View();
                    break;
                case 3 :
                    System.out.println("Bài 3: Tính tổng các số trên đường chéo chính");
                    totalDiagonalArray2View();
                    break;
                case 4 :
                    System.out.println("Bài 4: In ra tam giác trái trên");
                    triangleLeftAbove();
                    break;
                case 5 :
                    System.out.println("Bài 5: In ra tam giác trái dưới");
                    triangleLeftBottom();
                    break;
                case 6 :
                    System.out.println("Bài 6: In ra tam giác phải trên");
                    triangleRightAbove();
                    break;
                case 7 :
                    System.out.println("Bài 7: Tính tổng tam giác trái trên");
                    sumTriangleLeftAbove();
                    break;
                case 8 :
                    System.out.println("Bài 8: In ra tam giác phải dưới");
                    triangleRightBottom();
                    break;
                case 9 :
                    System.out.println("Bài 9: Tính tổng tam giác phải dưới");
                    sumTriangleRightBottom();
                    break;
                case 10 :
                    System.out.println("Bài 10:In ra các số nằm trên đường viền của ma trận");
                    middleSquare();
                    break;
                case 0 :
                    System.exit(0);
                    break;
            }
        }while (action!=0);
    }

    public static int[][] inputArray2() {
        System.out.println("Nhập số cột: ");
        int nCol = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số dòng: ");
        int nRow = Integer.parseInt(scanner.nextLine());
        int arr[][] = new int[nRow][nCol];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("Nhập cho a[%s][%s]: ", i, j);
//                int value = Integer.parseInt(scanner.nextLine());
                // 1-100
                int value = (int) (Math.random() * (100 - 1)) + 1;
                arr[i][j] = value;
            }
        }
        return arr;
    }

    public static void printArray2View() {
       printArray2(inputArray2());
    }

    public static String printArray2(int arr[][]) {
        String strArr = "";
        for (int i = 0; i < arr.length; i++) {
            String str = "[";
            for (int j = 0; j < arr[i].length; j++) {
                str += arr[i][j];
                if (j == arr[i].length - 1) {
                    str += "]";
                } else {
                    str += ",";
                }
            }
            str += "\n";
            strArr += str;
        }
        System.out.println(strArr);
        return strArr;
    }

    public static void totalEvenArray2View() {
       totalEvenArray2(inputArray2());
    }

    public static int totalEvenArray2(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    sum += arr[i][j];
                }
            }
        }
        printArray2(arr);
        System.out.println("tổng các số chẵn trong mảng 2 chiều là: " + sum);
        return sum;
    }

    public static void totalDiagonalArray2View() {
        int[][] array = inputArray2();
        printArray2(array);
        int sum = totalDiagonalArray2(array);
        System.out.println("Tổng của 2 đường chéo là: " + sum);
    }

    // Tinh tong cac gia tri tren 2 duong cheo chinh
    public static int totalDiagonalArray2(int arr[][]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for ( int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
                if (i + j == arr.length - 1) {
                    sum += arr[i][j];
                }
//                if(i==j || i + j == arr.length - 1){
//                    sum+= arr[i][j];
//                    System.out.printf(arr[i][j] +" ");
//                }
                System.out.print(arr[i][j] + " ");
            }

        }
        return sum;
    }

    // In ra tam giác
    public static void triangleLeftBottom() {
        System.out.println("Nhập số cột: ");
        int nCol = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số dòng: ");
        int nRow = Integer.parseInt(scanner.nextLine());
        int arr[][] = new int[nRow][nCol];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("Nhập cho a[%s][%s]: ", i, j);
//                int value = Integer.parseInt(scanner.nextLine());
                // 1-100
                int value = (int) (Math.random() * (100 - 1)) + 1;
                arr[i][j] = value;
            }
        }
        String print = printArray2(arr);
        System.out.println(print);
        for (int c = 0; c < arr.length; c++) {
            for (int r = 0; r < c + 1; r++) {
                System.out.print(arr[c][r] + " ");
            }
            System.out.println("");
        }
    }

    public static void sumTriangleLeftAbove() {
        System.out.println("Nhập số cột: ");
        int nCol = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số dòng: ");
        int nRow = Integer.parseInt(scanner.nextLine());
        int arr[][] = new int[nRow][nCol];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("Nhập cho a[%s][%s]: ", i, j);
//                int value = Integer.parseInt(scanner.nextLine());
                // 1-100
                int value = (int) (Math.random() * (100 - 1)) + 1;
                arr[i][j] = value;
            }
        }
        String print = printArray2(arr);
        System.out.println(print);
        int sum = 0;
        for (int c = 0; c < arr.length; c++) {
            for (int r = 0; r < arr.length - c; r++) {
                System.out.print(arr[c][r] + " ");
                sum += arr[c][r];
            }
            System.out.println("");
        }
        System.out.println("Tổng các giá trị trên đường biên là: " + sum);
    }

    public static void triangleLeftAbove() {
        System.out.println("Nhập số cột: ");
        int nCol = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số dòng: ");
        int nRow = Integer.parseInt(scanner.nextLine());
        int arr[][] = new int[nRow][nCol];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("Nhập cho a[%s][%s]: ", i, j);
//                int value = Integer.parseInt(scanner.nextLine());
                // 1-100
                int value = (int) (Math.random() * (100 - 1)) + 1;
                arr[i][j] = value;
            }
        }
        String print = printArray2(arr);
        System.out.println(print);
        for (int c = 0; c < arr.length; c++) {
            for (int r = 0; r < arr.length - c; r++) {
                System.out.print(arr[c][r] + " ");
            }
            System.out.println("");
        }
    }

    public static void triangleRightAbove() {
        System.out.println("Nhập số cột: ");
        int nCol = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số dòng: ");
        int nRow = Integer.parseInt(scanner.nextLine());
        int arr[][] = new int[nRow][nCol];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("Nhập cho a[%s][%s]: ", i, j);
//                int value = Integer.parseInt(scanner.nextLine());
                // 1-100
                int value = (int) (Math.random() * (100 - 1)) + 1;
                arr[i][j] = value;
            }
        }
        String print = printArray2(arr);
        System.out.println(print);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j < i) {
                    String str = " ";
                    str = String.valueOf((arr[i][j]));
                    str = "   ";
                    System.out.print(str);
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

    public static void sumTriangleRightBottom() {
        System.out.println("Nhập số cột: ");
        int nCol = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số dòng: ");
        int nRow = Integer.parseInt(scanner.nextLine());
        int arr[][] = new int[nRow][nCol];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("Nhập cho a[%s][%s]: ", i, j);
//                int value = Integer.parseInt(scanner.nextLine());
                // 1-100
                int value = (int) (Math.random() * (99 - 11)) + 11;
                arr[i][j] = value;
            }
        }
        String print = printArray2(arr);
        System.out.println(print);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j < (arr.length - i) - 1) {
                    String str = " ";
                    str = String.valueOf((arr[i][j]));
                    str = "   ";
                    System.out.print(str);
                } else {
                    System.out.print(arr[i][j] + " ");
                }
                if (arr[i][j] % 2 == 0) {
                    sum += arr[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("Tổng số chẵn trong tam giác là: " + sum);
    }

    public static void triangleRightBottom() {
        System.out.println("Nhập số cột: ");
        int nCol = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số dòng: ");
        int nRow = Integer.parseInt(scanner.nextLine());
        int arr[][] = new int[nRow][nCol];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("Nhập cho a[%s][%s]: ", i, j);
//                int value = Integer.parseInt(scanner.nextLine());
                // 1-100
                int value = (int) (Math.random() * (99 - 11)) + 11;
                arr[i][j] = value;
            }
        }
        String print = printArray2(arr);
        System.out.println(print);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j < (arr.length - i) - 1) {
                    String str = " ";
                    str = String.valueOf((arr[i][j]));
                    str = "   ";
                    System.out.print(str);
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

    public static void middleSquare() {
        System.out.println("Nhập số cột: ");
        int nCol = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số dòng: ");
        int nRow = Integer.parseInt(scanner.nextLine());
        int arr[][] = new int[nRow][nCol];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("Nhập cho a[%s][%s]: ", i, j);
//                int value = Integer.parseInt(scanner.nextLine());
                // 1-100
                int value = (int) (Math.random() * (99 - 11)) + 11;
                arr[i][j] = value;
            }
        }
        String print = printArray2(arr);
        System.out.println(print);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 0) {
                    System.out.print(arr[i][j] + " ");
                }
                if (i != 0 && i != arr.length - 1) {
                    if (j == 0 || j == arr.length - 1) {
                        System.out.print(arr[i][j] + " ");
                    } else {
                        String str = "";
                        str = String.valueOf(arr[i][j]);
                        str = "   ";
                        System.out.print(str);
                    }
                }
                if (i == arr.length - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println(" ");
        }
    }

}
