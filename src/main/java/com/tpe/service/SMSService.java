package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Properties;
import java.util.Random;

@Component("SMSService")
//@Scope("prototype")
public class SMSService implements MessageService {


    @PostConstruct
    public void init(){
        System.out.println("SMSService's constructor created ");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("SMSService's constructor destroyed ");
    }


//    private Repo repo;
//    @Autowired
//    public SMSService (@Qualifier("DbRepository") Repo repo) {
//        this.repo = repo;
//    }

//    @Autowired
//    @Qualifier("DbRepository")
//    private Repo repo;
    private Repo repo;


    private Random random;
    @Autowired
    public SMSService (Random random) {
        this.random = random;
    }

    @Autowired
    @Qualifier("DbRepository")
    public void setRepo(Repo repo){
        this.repo = repo;
    }




    @Override
    public void sendMessage (Message message) {
        System.out.println("This is SMS. your package has arrived: "+message.getMessage());
    }

    @Override
    public void save (Message message) {
repo.saveMessage(message);
    }


    @Value("${fullname}")
    private String fullname;

    @Value("${phoneNo}")
    private String phoneNo;


    public void printContact(){
        System.out.println("fullname: "+fullname);
        System.out.println("phoneNo: "+phoneNo);
    }

    @Autowired
    private Properties properties;
    public void printProperties(){
        System.out.println("My fullname: "+properties.getProperty("fullname"));
        System.out.println("My phoneNo: "+properties.getProperty("phoneNo"));
    }



}
