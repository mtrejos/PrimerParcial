/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PrimerParcial.controller;

import com.PrimerParcial.entity.artistas;
import com.PrimerParcial.service.IartistasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author maria
 */
@Controller
public class ArtistasController {
    
    @Autowired
      private IartistasService artistasService;
    
     @GetMapping("/artistas")
    public String index(Model model){
      List<artistas> listaartistas=artistasService.getAll();
      model.addAttribute("titulo","artistas");
      return "artistas";
    }
      @GetMapping("/artistasN")
    public String crearartista(Model model){
     model.addAttribute("artistas", new  artistas());
      return "crear";
    }
    
    @PostMapping("/save")
    public String guardarartistas(@ModelAttribute artistas artista){
    artistasService.save(artista);
    return "redirect:/artista";
    }
    
    
    @GetMapping("/delte/{id}")
    public String eliminarartista(@PathVariable("id") Long idartistas){
    artistasService.delete(idartistas);
    return"redirect:/artista";
    }
}
