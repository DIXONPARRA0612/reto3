/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.ClientInterface;
import com.example.demo.Modelo.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DIXON
  */

@Repository

public class ClientRepository {
    @Autowired
    private ClientInterface extencionesCrud;
    
    public List<Client> getAll (){
        return (List<Client>) extencionesCrud.findAll();
    }
    
    public Optional<Client> getClient(int id){
        return extencionesCrud.findById(id);
    }
    
    public Client save(Client client){
        return extencionesCrud.save(client);
    }
}
