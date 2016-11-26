package com.eric.appfit.ws.dao.impl;

import com.sun.jersey.spi.inject.Inject;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

/**
 * Created by ericvyc on 26/11/16.
 */
public abstract class BaseDaoImpl<T, I extends Serializable> {

    @Inject
    protected EntityManager entityManager;

    private Class<T> persistedClass;

    protected BaseDaoImpl() {
    }

    protected BaseDaoImpl(Class<T> persistedClass) {
        this();
        this.persistedClass = persistedClass;
    }

    public T save(@Valid T entity) {
        EntityTransaction t = entityManager.getTransaction();
        t.begin();
        entityManager.persist(entity);
        entityManager.flush();
        t.commit();
        return entity;
    }

    public T update(@Valid T entity) {
        EntityTransaction t = entityManager.getTransaction();
        t.begin();
        entityManager.merge(entity);
        entityManager.flush();
        t.commit();
        return entity;
    }

    public void remove(I id) {
        T entity = findById(id);
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        T mergedEntity = entityManager.merge(entity);
        entityManager.remove(mergedEntity);
        entityManager.flush();
        tx.commit();
    }

    public List<T> findAll() {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(persistedClass);
        query.from(persistedClass);
        return entityManager.createQuery(query).getResultList();
    }

    public T findById(I id) {
        return entityManager.find(persistedClass, id);
    }
}
