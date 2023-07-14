package com.tpe.repository;


import com.tpe.domain.Message;
import org.springframework.stereotype.Component;

@Component("DbRepository")
public class DbRepository implements Repo{
    @Override
    public void saveMessage (Message message) {
        System.out.println("This message saved to Database :"+message.getMessage());
    }
}
