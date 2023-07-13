package com.tpe.repository;


import com.tpe.domain.Message;

public class DbRepository implements Repo{
    @Override
    public void saveMessage (Message message) {
        System.out.println("This message saved to Database :"+message.getMessage());
    }
}
