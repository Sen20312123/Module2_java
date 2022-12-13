package service;

import java.util.List;

public interface IExperienceService<T> {

    List<T> findAll();

    T findById(int id);

    public void showMe() ;
    void add(T newExperience);

    public void deleteById(int id);

    void update(T newExperience);

    public boolean existById(int id );

}
