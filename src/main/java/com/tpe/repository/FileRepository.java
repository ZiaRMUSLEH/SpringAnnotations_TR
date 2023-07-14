package com.tpe.repository;

import com.tpe.domain.Message;
import org.springframework.stereotype.Component;

@Component("FileRepository")
public class FileRepository implements Repo{


    @Override
    public void saveMessage (Message message) {
        System.out.println("This message saved to file: "+message.getMessage());
    }
}
