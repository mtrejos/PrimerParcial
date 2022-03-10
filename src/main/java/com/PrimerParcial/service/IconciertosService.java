/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PrimerParcial.service;

import com.PrimerParcial.entity.conciertos;
import java.util.List;

/**
 *
 * @author maria
 */
public interface IconciertosService {
     public List<conciertos> getAll();
    public void save(conciertos conciertos);
    public conciertos getPersonById(long id);
    public void delete(long id);
}
