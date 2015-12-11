package io.tonyc.websample.service;

import io.tonyc.websample.domain.User;

import java.util.List;

/**
 * Created by Tony on 2015/12/10.
 */
public interface UserService {

    User findById(Integer id);

    List<User> findAll();

}
