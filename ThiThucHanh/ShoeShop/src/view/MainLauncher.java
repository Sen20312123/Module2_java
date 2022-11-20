package view;

import java.util.Scanner;

public class MainLauncher {
    private static Scanner scanner = new Scanner(System.in);

    public MainLauncher() {
        launch();
    }
    public static void launch() {
        menuProduct();
        ProductViewMenu.runProduct();
    }

    public static void menuOption() {
        do {
            menuProduct();
            System.out.println("Chọn chức năng:  ");
            try {
                System.out.println("Chọn chức năng: ");
                System.out.print("➱ ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        ProductViewMenu.runProduct();
                        break;

                    default:
                        System.out.println("Nhập sai ⚔️Vui lòng nhập lại! ");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error!  ̿’̿’\\̵͇̿̿\\");
            }
        } while (true);
    }
    public static void menuProduct() {
        System.out.println("\t┌──────────────────────────────────────────────────────────┐");
        System.out.println("\t│► ░░░░░░░░░░░░░░░░░░░[QUẢN LÝ SẢN PHẨM]░░░░░░░░░░░░░░░░░ ◄│");
        System.out.println("\t└──────────────────────────────────────────────────────────┘");
        System.out.println("\t│               【1】. Thêm sản phẩm                        │");
        System.out.println("\t│               【2】. Sửa thông tin sản phẩm               │");
        System.out.println("\t│               【3】. Tìm sản phẩm có giá đắt nhất         │");
        System.out.println("\t│               【4】. Hiển thị danh sách sản phẩm          │");
        System.out.println("\t│               【5】. Sắp xếp sản phẩm                     │");
        System.out.println("\t│               【6】. Xóa sản phẩm                         │");
        System.out.println("\t│               【7】. Quay lại menu                        │");
        System.out.println("\t│               【8】. Thoát                                │");
        System.out.println("\t└──────────────────────────────────────────────────────────┘");
        System.out.println("Chọn chức năng");
        System.out.printf("⭆ \t");
    }
        public static void inputUpdate() {
            System.out.println("\t┌───────────────────────────────────────────────────┐");
            System.out.println("\t│► ░░░░░░░░░░░░░░░░░░░░[CẬP NHẬT]░░░░░░░░░░░░░░░░░ ◄│");
            System.out.println("\t└───────────────────────────────────────────────────┘");
            System.out.println("\t│               【1】. Cập nhật giá                  │");
            System.out.println("\t│               【2】. Cập nhật số lượng             │");
            System.out.println("\t│               【3】. Cập nhật tên                  │");
            System.out.println("\t│               【4】. Cập nhật type                 │");
            System.out.println("\t│               【5】. Quay lại                      │");
            System.out.println("\t└───────────────────────────────────────────────────┘");
            System.out.println("Chọn chức năng");
            System.out.printf("⭆ \t");
        }
}

