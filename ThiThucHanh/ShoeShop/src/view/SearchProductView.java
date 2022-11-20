package view;

import model.Product;
import service.ProductService;
import sort.SortByPriceAsc;
import sort.SortByPriceDesc;
import sort.SortByQuantityAsc;
import utils.InstantUtils;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

import static view.SortProductView.products;

public class SearchProductView {
   private static Scanner scanner = new Scanner(System.in);
    private static ProductView productView = new ProductView();
   private static ProductService productService = new ProductService();
   private static DecimalFormat format = new DecimalFormat("###,###,###" + "đ");

    public static void search() {

//        productView.show(productService.findAll());
        boolean flag = true;
        int choice = -1;
        do {
            System.out.println("\t┌──────────────────────────────────────────────────────────┐");
            System.out.println("\t│► ░░░░░░░░░░░░░░░░░░[ TÌM KIẾM SẢN PHẨM]░░░░░░░░░░░░░░░░ ◄│");
            System.out.println("\t└──────────────────────────────────────────────────────────┘");
            System.out.println("\t│               【1】. Tìm kiếm theo giá sản phẩm           │");
            System.out.println("\t│               【0】. Quay lại                             │");
            System.out.println("\t└──────────────────────────────────────────────────────────┘");
            System.out.println("Chọn chức năng: ");
            System.out.print("➽ ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (Exception e) {
                e.printStackTrace();
            }
            switch (choice) {
                case 1:
                    List<Product> productList = productService.findAll();
                    System.out.println("Sắp xếp giá cao nhất");
                    SortByPriceDesc sortByPriceDesc = new SortByPriceDesc();
                    productList.sort(sortByPriceDesc);
                    for (int i = 0; i <= productList.size(); i++){
                        if (i == 0){
                            System.out.println("─────────────────────────────────────Product⟚List─────────────────────────────────────");
                            System.out.printf("%-25s %-20s %-20s %-20s\n", "IdProduct", "NameProduct", "Price", "Quantity");
                            System.out.println("──────────────────────────────────────────────────────────────────────────────────────────");
                            System.out.printf("%-25s %-20s %-20s %-20s\n",
                                    productList.get(0).getId(),
                                    productList.get(0).getName(),
                                    InstantUtils.doubleToVND(productList.get(0).getPrice()),
                                    InstantUtils.quantityProduct(productList.get(0).getQuantity())
                            );
                        }
                    }
                    break;
                case 0:
                    MainLauncher.menuProduct();
                    ProductViewMenu.runProduct();
                    break;
                default:
                    System.out.println("Nhập sai !!! Vui lòng nhập lại !!!");
                    break;
            }
        }while (flag);
    }






}
