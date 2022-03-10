/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PrimerParcial.repository;

import com.PrimerParcial.entity.artistas;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author maria
 */
@Repository
public interface artistasRepository extends CrudRepository<artistas,Long>{
    
}
