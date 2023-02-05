package com.tpe.service;

import com.tpe.domain.Message;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("mailService")
public class MailService implements MessageService{


    @Override
    public void sendMessage(Message message) {
        System.out.println("Ben Mail Servisiyim, size mesaj gonderiyorum : " + message.getMessage());
    }
}
