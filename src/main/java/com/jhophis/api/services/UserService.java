package com.jhophis.api.services;

import com.jhophis.api.domain.User;
import com.jhophis.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
}
