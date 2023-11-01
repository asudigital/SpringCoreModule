package com.spring.core;

import com.spring.core.controller.Democontroller;
import com.spring.core.repository.DemoRepository;
import com.spring.core.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoClient {

    public static void main(String[] args){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Democontroller democontroller = applicationContext.getBean(Democontroller.class);
        System.out.println(democontroller.Hello());

        DemoService demoservice= applicationContext.getBean(DemoService.class);
        System.out.println(demoservice.hello());

        DemoRepository demoRepository=applicationContext.getBean(DemoRepository.class);
        System.out.println(demoRepository.hello());
    }
}
