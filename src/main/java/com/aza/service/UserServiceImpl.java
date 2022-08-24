package com.aza.service;

import com.aza.dao.UserDao;
import com.aza.model.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{
   private UserDao userDao;

 public UserServiceImpl(UserDao userDao) {
  this.userDao = userDao;
 }

 @Override
    public void save(User user) {
    userDao.save(user);
    }

    @Override
    public Object getById(Long id) {
     return userDao.getById(id);
    }

    @Override
    public void update(User user) {
    userDao.update(user);
    }

    @Override
    public void delete(Long id) {
    userDao.delete(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
