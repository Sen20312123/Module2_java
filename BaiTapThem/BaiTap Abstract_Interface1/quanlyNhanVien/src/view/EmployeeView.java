package view;

import model.Intern;
import service.EmployeeService;
import service.IEmployeeService;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeView {
    private static Scanner scanner = new Scanner(System.in);
    private final IEmployeeService employeeService;

    public EmployeeView() {
        employeeService = EmployeeService.getInstance();
    }

    public void addIntern() {
        try {
            long id = System.currentTimeMillis() / 1000;
            System.out.println("Nhập tên:");
            System.out.println(" -->");
            String name = scanner.nextLine();
            System.out.println("Nhập ngày tháng năm sinh:");
            System.out.println(" -->");
            LocalDate birthday = LocalDate.parse(scanner.nextLine());
            System.out.println("Nhập sdt:");
            System.out.println(" -->");
            String phone = scanner.nextLine();
            System.out.println("Nhập email:");
            System.out.println(" -->");
            String email = scanner.nextLine();
            System.out.println("Chuyên ngành đang học:)");
            System.out.println(" -->");
            String majors = scanner.nextLine();
            System.out.println("Học kì đang học:");
            System.out.println(" -->");
            String semester = scanner.nextLine();
            System.out.println("Tên trường đang học:");
            System.out.println(" -->");
            String universityName = scanner.nextLine();

            Intern newIntern = new Intern(id, name, birthday, phone, email, majors, semester, universityName);
            employeeService.add(newIntern);
            System.out.println("Đã thêm thành công!!!");
        } catch (Exception e) {
            System.out.println("saiiiiiii");
            e.printStackTrace();
        }
    }
}
