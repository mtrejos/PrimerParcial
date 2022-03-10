/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PrimerParcial.service;

import com.PrimerParcial.entity.artistas;
import com.PrimerParcial.repository.artistasRepository;
import com.PrimerParcial.repository.conciertosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author maria
 */
@Service
public class artistasService {
     @Autowired
    private artistasRepository artistasRepository;
    
    public List<artistas> getAll() {
        return(List<artistas>)artistasRepository.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void savePerson(artistas artista) {
       artistasRepository.save(artista); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public artistas getPersonById(long id) {
    return artistasRepository.findById(id).orElse(null); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void delete(long id) {
        artistasRepository.deleteById(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
