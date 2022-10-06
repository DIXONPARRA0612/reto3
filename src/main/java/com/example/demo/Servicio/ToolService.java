/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Servicio;

import com.example.demo.Repositorio.ToolRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Modelo.Tool;

/**
 *
 * @author DIXON
 */

@Service

public class ToolService {
      @Autowired
    private ToolRepository toolRepository;
    
    public List<Tool> getAll(){
        return toolRepository.getAll();
    }
    
    public Optional<Tool> getTool(int id){
        return toolRepository.getTool(id);
    }
    
    public Tool save (Tool tool){
        if (tool.getId() == null){
            return toolRepository.save(tool);
        } else {
            Optional<Tool> tool1 = toolRepository.getTool(tool.getId());
            if(tool1.isEmpty()){
                return toolRepository.save(tool);
            } else {
                return tool;
            }
        }
    }
}
