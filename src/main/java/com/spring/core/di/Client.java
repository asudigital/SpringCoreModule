package com.spring.core.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String args[]){

//        Message sender is tightly coupled with respective service class
        String message = "Hi , goodmorning have a great day!";
//        SMSService smsService = new SMSService();
//        EmailService emailService = new EmailService();

//        MessageSender messageSender = new MessageSender(emailService);
//        messageSender.sendMessage(message);

        //code using spring framework

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        MessageSender messageSender = applicationContext.getBean(MessageSender.class);
        messageSender.sendMessage(message);
    }
}
