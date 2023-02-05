package com.tpe.app;

import com.tpe.AppConfiguration;
import com.tpe.domain.Message;
import com.tpe.service.MailService;
import com.tpe.service.MessageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {

    public static void main(String[] args) {

        Message message = new Message();
        message.setMessage("Siparisiniz verildi!");

        //!!! Config dosyami gosterdim
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);

        //bean talep ediyoruz , interface yapisi hangi child i bean olarak ilusturcagini anliyamadigi icin exception firlatir
//        MessageService service = context.getBean(MessageService.class);

        MessageService service = context.getBean("whatsAppService",MessageService.class);

        service.sendMessage(message);

        context.close(); // programi kapatirken olusan beanleri yok ediyoruz.

    }

}
