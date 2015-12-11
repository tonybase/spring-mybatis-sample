package io.tonyc.websample.service.impl;

import io.tonyc.websample.dao.UserDao;
import io.tonyc.websample.domain.User;
import io.tonyc.websample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tony on 2015/12/10.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User findById(Integer id) {
        return userDao.findById(id);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

}
