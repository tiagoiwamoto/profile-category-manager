package br.com.kamehouse.profilecategorymanager.core.port;

import java.util.List;

public interface CategoryPort<R, T> {

    R save(T category);
    R update(T category);
    R delete(T category);
    R findById(Long id);
    List<R> findAll();
}
