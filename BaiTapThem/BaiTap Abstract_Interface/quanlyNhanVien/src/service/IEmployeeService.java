package service;

import model.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> findAll();

    Employee findId(int id);

    void add(Employee newEmployee);

    boolean deleteById(int id);

    void update(Employee newEmployee);

    List<Employee> findType (int type);
}