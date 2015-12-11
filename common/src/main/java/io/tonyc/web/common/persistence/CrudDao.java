package io.tonyc.web.common.persistence;

import java.util.List;

/**
 * Created by Tony on 2015/12/11.
 */
public interface CrudDao<K, T> {

    T findById(K id);

    List<T> findAll();

    void delete(K id);

    void save(T entity);

    int count();

}
