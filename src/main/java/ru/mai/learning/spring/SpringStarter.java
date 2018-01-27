package ru.mai.learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.mai.learning.spring.service.UserService;

public class SpringStarter {


    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//        UserService service1 = (UserService) context.getBean("myService");
        UserService service2 = context.getBean(UserService.class);


    }
}
