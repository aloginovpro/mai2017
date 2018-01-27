package ru.mai.learning.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    public final UserDao dao;

    @Autowired
    public UserService(UserDao dao) {
        this.dao = dao;
    }
}
