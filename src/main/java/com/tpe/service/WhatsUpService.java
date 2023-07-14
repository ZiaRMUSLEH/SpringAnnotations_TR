package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("WhatsUpService")
@Scope("prototype")
public class WhatsUpService implements MessageService {

    @PostConstruct
    public void init(){
        System.out.println("WhatsUpService's constructor created ");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("WhatsUpService's constructor destroyed ");
    }


    @Autowired
    @Qualifier("FileRepository")
    private Repo repo;


    @Override
    public void sendMessage (Message message) {
        System.out.println("This is WhatsUp. your package has arrived: "+message.getMessage());
    }

    @Override
    public void save (Message message) {
repo.saveMessage(message);
    }
}
