package com.aza.service;

import com.aza.model.User;

import java.util.List;

public interface UserService {

    void save(User user);
    Object getById(Long id);
    void update(User user);
    void delete(Long id);
    List<User> getAllUsers();
}
