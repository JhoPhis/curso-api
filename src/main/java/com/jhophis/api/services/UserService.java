package com.jhophis.api.services;

import com.jhophis.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
}
