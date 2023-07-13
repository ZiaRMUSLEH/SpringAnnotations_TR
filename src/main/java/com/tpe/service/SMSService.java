package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.Repo;
import org.springframework.stereotype.Component;

@Component
public class SMSService implements MessageService {


    @Override
    public void sendMessage (Message message) {
        System.out.println("This is SMS. your package has arrived: "+message.getMessage());
    }

    @Override
    public void save (Message message) {

    }
}
