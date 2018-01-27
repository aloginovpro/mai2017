package ru.mai.learning.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.mai.learning.spring.service")
public class SpringConfig {

/*
    @Bean("myDao")
    public UserDao userDao() {
        return new UserDao();
    }

    @Bean("myService")
    public UserService userService(UserDao userDao) {
        return new UserService(userDao);
    }
*/

}
