package service;

import model.Employee;
import model.EmployeeFactory;
import model.Intern;
import utils.CSVUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class InternService implements IEmployeeService {

    private static final String PATH = "E:\\Module2\\Module2_java\\BaiTapThem\\BaiTap Abstract_Interface1\\quanlyNhanVien\\data\\intern.csv";

    private static EmployeeFactory employeeFactory;
    private static InternService instance;

    public InternService() {

    }

    public static InternService getInstance() {
        if (instance == null)
            instance = new InternService();
        return instance;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        List<String> records = CSVUtils.readFile(PATH);
        for (String record : records) {
            employees.add(employeeFactory.getEmployee(record));
        }
        return employees;
    }

    @Override
    public Intern findById(int id) {
        List<Intern> interns = findAll();
        for (Intern intern : interns) {
            if (intern.getId() == id)
                return intern;
        }
        return null;
    }

    @Override
    public void showMe() {
        List<Intern> interns = getInstance().findAll();
        for (Intern intern : interns) {
            System.out.printf("\t│\t%-10s   ││   %-20s   ││    %15s      ││     %12s    ││    %-15s    ││    %-15s    ││    %-15s    ││    %19s    ││    %19s    ││    %19s    │\n",
                    intern.getId(),
                    intern.getFullName(),
                    intern.getBirthDay(),
                    intern.getPhone(),
                    intern.getEmail(),
                    intern.getEmployeeType(),
                    intern.getEmployeeCount(),
                    intern.getMajors(),
                    intern.getSemester(),
                    intern.getUniversityName());
        }
    }

    @Override
    public void add(Employee employee) {
        List<Employee> interns = findAll();
        interns.add((Intern) newIntern);
        CSVUtils.writeFile(PATH, interns);
    }

    @Override
    public void deleteById(int id) {
        List<Intern> interns = findAll();
        interns.removeIf(new Predicate<Intern>() {
            @Override
            public boolean test(Intern intern) {
                return intern.getId() == id;
            }
        });
        CSVUtils.writeFile(PATH, interns);
    }

    @Override
    public void update(Object newEmployee) {

    }

    @Override
    public boolean existById(int id) {
        return findById(id) != null;
    }
}
