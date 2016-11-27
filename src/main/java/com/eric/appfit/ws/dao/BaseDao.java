package com.eric.appfit.ws.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ericvyc on 26/11/16.
 */
public interface BaseDao<T, I extends Serializable> {

    T save(T entity);

    T update(T entity);

    void remove(I id);

    List<T> findAll();

    T findById(I id);

}
