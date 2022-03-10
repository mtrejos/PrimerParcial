/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PrimerParcial.service;

import com.PrimerParcial.entity.conciertos;
import com.PrimerParcial.repository.conciertosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 *
 * @author maria
 */
@Service
public class conciertosService {
      @Autowired
    private conciertosRepository conciertosRepository;
    
    public List<conciertos> getAll() {
        return(List<conciertos>)conciertosRepository.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void savePerson(conciertos concierto) {
       conciertosRepository.save(concierto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public conciertos getPersonById(long id) {
    return conciertosRepository.findById(id).orElse(null); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void delete(long id) {
        conciertosRepository.deleteById(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
