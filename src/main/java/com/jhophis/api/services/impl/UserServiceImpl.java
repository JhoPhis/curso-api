package com.jhophis.api.services.impl;

import com.jhophis.api.domain.User;
import com.jhophis.api.repositories.UserRepository;
import com.jhophis.api.services.UserService;
import com.jhophis.api.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado."));
    }
}
