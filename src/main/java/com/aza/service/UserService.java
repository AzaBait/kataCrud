package com.aza.service;

import com.aza.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void save(User user);
    Optional<User> getById(Long id);
    void update(User user);
    void delete(Long id);
    List<User> getAllUsers();
}
