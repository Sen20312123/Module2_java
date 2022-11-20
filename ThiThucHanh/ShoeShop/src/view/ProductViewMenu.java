package view;

import java.util.Scanner;

public class ProductViewMenu {
    private static Scanner scanner = new Scanner(System.in);

    public static void runProduct() {
        int choice;
        boolean flag = true;
        try {
            do {
                ProductView productView = new ProductView();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        productView.addProduct();
                        runProduct();
                        break;
                    case 2:
                        productView.update();
                        runProduct();
                        break;
                    case 3:
                        SearchProductView.search();
                        break;
                    case 4:
                        productView.showProduct(InputOption.SHOW);
                        MainLauncher.menuProduct();
                        runProduct();
                        break;
                    case 5:
                        SortProductView.choice();
                        break;
                    case 6:
                        productView.remove();
                        break;
                    case 7:
                        MainLauncher.menuOption();
                        break;
                    case 8:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Nhập sai ❌ Vui lòng nhập lại!");
                }
            }while (!flag);
        }catch (Exception e) {
            System.out.println("Nhập sai ❌️Vui lòng nhập lại");
            runProduct();
        }
    }
}
