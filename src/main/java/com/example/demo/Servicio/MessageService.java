/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Servicio;

import com.example.demo.Modelo.Message;
import com.example.demo.Repositorio.MessageRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DIXON
 */
@Service

public class MessageService {
    @Autowired
    private MessageRepository messaggeRepository;
    
    public List<Message> getAll(){
        return messaggeRepository.getAll();
    }
    
    public Optional<Message> getMessage(int id){
        return messaggeRepository.getMessage(id);
    }
    
   public Message  save (Message message){
       if (message.getIdMessage() == null){
           return messaggeRepository.save(message);
       } else{
           Optional<Message> message1 = messaggeRepository.getMessage(message.getIdMessage());
           if(message1.isEmpty()){
               return messaggeRepository.save(message);
            } else {
               return message;
           }
       }
    }
}
