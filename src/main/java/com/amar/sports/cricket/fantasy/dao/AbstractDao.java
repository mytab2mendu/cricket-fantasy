package com.amar.sports.cricket.fantasy.dao;

import com.amar.sports.cricket.fantasy.domain.Entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AbstractDao {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void persist(Entity entity) {
        getSession().persist(entity);
    }

    public void save(Entity entity) {
        getSession().saveOrUpdate(entity);
    }

    public void delete(Entity entity) {
        getSession().delete(entity);
    }
}