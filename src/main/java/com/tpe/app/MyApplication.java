package com.tpe.app;

import com.tpe.AppConfiguration;
import com.tpe.domain.Message;
import com.tpe.repository.DbRepository;
import com.tpe.repository.Repo;
import com.tpe.service.MessageService;
import com.tpe.service.SMSService;
import com.tpe.service.WhatsUpService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;

public class MyApplication {
    public static void main (String[] args) {


        Message message = new Message();
        message.setMessage("working with spring is nice");

//        Repo repo = new DbRepository();
//        MessageService messageService = new SMSService(repo);
//        messageService.save(message);
//        messageService.sendMessage(message);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
//        MessageService service = context.getBean("SMSService",MessageService.class);
//        //service.sendMessage(message);
//        //service.save(message);
//
//
//        Random random = context.getBean(Random.class);
//        //System.out.println(random.nextInt(100));
//
//
//        MessageService messageService = context.getBean(WhatsUpService.class);
//        MessageService messageService1 = context.getBean(WhatsUpService.class);
//
//        if (messageService==messageService1){
//            System.out.println("same");
//        }else {
//            System.out.println("different ");
//        }


        SMSService smsService = context.getBean(SMSService.class);
        smsService.sendMessage(message);
        smsService.printContact();
        smsService.printProperties();

        //context.getBeanFactory().destroyBean(messageService1);






        context.close();


        /*
        git remote add origin https://github.com/ZiaRMUSLEH/SpringMVC_TR.git
git branch -M main
git push -u origin main
         */




    }
}
