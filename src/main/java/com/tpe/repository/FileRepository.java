package com.tpe.repository;

import com.tpe.domain.Message;

public class FileRepository implements Repo{


    @Override
    public void saveMessage (Message message) {
        System.out.println("This message saved to file: "+message.getMessage());
    }
}
