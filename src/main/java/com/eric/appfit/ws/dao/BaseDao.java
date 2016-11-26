package com.eric.appfit.ws.dao;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

/**
 * Created by ericvyc on 26/11/16.
 */
public interface BaseDao<T, I extends Serializable> {

    T save(@Valid T entity);

    T update(@Valid T entity);

    void remove(I id);

    List<T> findAll();

    T findById(I id);

}
