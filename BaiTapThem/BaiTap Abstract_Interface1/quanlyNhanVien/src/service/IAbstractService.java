package service;

import java.util.List;

public interface IAbstractService<T> {
    List<T> findAll();

    T findById(int id);

    void add(T newEmployee);

    void deleteById(int id);

    void update(T newEmployee);

    public boolean existById(int id);
}
