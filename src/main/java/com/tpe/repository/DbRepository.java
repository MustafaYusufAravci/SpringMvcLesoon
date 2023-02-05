package com.tpe.repository;

import com.tpe.domain.Message;
import org.springframework.stereotype.Component;

@Component
public class DbRepository implements Repository{


    @Override
    public void saveMessage(Message message) {
        System.out.println("Mesajiniz Veri Tabanina kaydedildi : " + message.getMessage());
    }
}
