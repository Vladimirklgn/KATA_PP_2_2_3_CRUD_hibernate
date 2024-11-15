package org.example.service;

import org.example.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getUsers() {
        return List.of();
    }
}
