/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PrimerParcial.controller;

import com.PrimerParcial.entity.conciertos;

import com.PrimerParcial.service.IconciertosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author maria
 */
public class ConciertosController {
    
     @Autowired
      private IconciertosService conciertosService;
    
     @GetMapping("/conciertos")
    public String index(Model model){
      List<conciertos> listaconcierto=conciertosService.getAll();
      model.addAttribute("titulo","conciertos");
      return "conciertos";
    }
      @GetMapping("/conciertosN")
    public String crearconcierto(Model model){
     model.addAttribute("conciertos", new  conciertos());
      return "crear";
    }
    
    @PostMapping("/save")
    public String guardarconciertos(@ModelAttribute conciertos concierto){
    conciertosService.save(concierto);
    return "redirect:/conciertos";
    }
    
    
    @GetMapping("/delte/{id}")
    public String eliminarconcierto(@PathVariable("id") Long idconciertos){
    conciertosService.delete(idconciertos);
    return"redirect:/conciertos";
    }
    
}
