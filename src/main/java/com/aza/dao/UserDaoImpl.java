package com.aza.dao;

import com.aza.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
public class UserDaoImpl implements UserDao{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
     public List getAllUsers() {
        return entityManager.createQuery("select u from User u").getResultList();
    }
    @Override
    public User getById(Long id) {

        return entityManager.find(User.class,id);
    }
    @Override
    public void save(User user) {
    entityManager.persist(user);
    }
    @Override
    public void delete(Long id) {
    entityManager.remove(getById(id));
    }
    @Override
    public void update(User user) {
    entityManager.merge(user);
    }
}
