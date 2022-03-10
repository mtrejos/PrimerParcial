/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PrimerParcial.service;

import com.PrimerParcial.entity.artistas;

import java.util.List;

/**
 *
 * @author maria
 */
public interface IartistasService {
     public List<artistas> getAll();
    public void save(artistas artistas);
    public artistas getPersonById(long id);
    public void delete(long id);
}
