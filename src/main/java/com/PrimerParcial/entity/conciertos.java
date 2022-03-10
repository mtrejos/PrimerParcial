/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PrimerParcial.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 *
 * @author maria
 */
@Entity
@Table (name="conciertos")
public class conciertos implements Serializable {
      @Id
  @GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
    
    private int id;
    private String costo;
    private String fecha;
    private String capcacidad;
    private String lugar;
    
    @ManyToOne
    @JoinColumn(name="artistas_id")
    private artistas artista;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCapcacidad() {
        return capcacidad;
    }

    public void setCapcacidad(String capcacidad) {
        this.capcacidad = capcacidad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public artistas getArtista() {
        return artista;
    }

    public void setArtista(artistas artista) {
        this.artista = artista;
    }

   
}
