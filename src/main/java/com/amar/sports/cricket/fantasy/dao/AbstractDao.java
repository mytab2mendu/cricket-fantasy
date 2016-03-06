package com.amar.sports.cricket.fantasy.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao<T> {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void persist(T t) {
        getSession().persist(t);
    }

    public void save(T t) {
        getSession().saveOrUpdate(t);
    }

    public void delete(T t) {
        getSession().delete(t);
    }
}