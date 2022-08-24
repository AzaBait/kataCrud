package com.aza.dao;

import com.aza.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers ();
    User getById(Long id);
    void save(User user);
    void delete(Long id);
    void update(User user);
}
