package com.tpe.app;

import com.tpe.AppConfiguration;
import com.tpe.domain.Message;
import com.tpe.repository.DbRepository;
import com.tpe.repository.Repo;
import com.tpe.service.MessageService;
import com.tpe.service.SMSService;
import com.tpe.service.WhatsUpService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
    public static void main (String[] args) {


        Message message = new Message();
        message.setMessage("working with spring is nice");

//        Repo repo = new DbRepository();
//        MessageService messageService = new SMSService(repo);
//        messageService.save(message);
//        messageService.sendMessage(message);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        MessageService service = context.getBean(WhatsUpService.class);
        service.sendMessage(message);

        context.close();




    }
}
