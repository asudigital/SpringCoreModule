package com.spring.core.di;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SMSService implements MessageService{

    @Override
    public void sendMessage(String message){
        System.out.println(message);
    }
}
