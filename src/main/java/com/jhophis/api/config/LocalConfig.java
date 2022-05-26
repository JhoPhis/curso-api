package com.jhophis.api.config;

import com.jhophis.api.domain.User;
import com.jhophis.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void starDB(){
        User u1 = new User(null, "Siqueira", "siq@mail.com", "123");
        User u2 = new User(null, "Ribeiro", "rib@mail.com", "123");

        repository.saveAll(List.of(u1, u2));
    }
}
