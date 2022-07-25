/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cineflex.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="pelicula")
public class Cartelera implements Serializable{
    
     private static final long serialVersionUID =1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long idPelicula; //id_pelicula
    private double precio;
    private String categoria;
    private String critica;
    private String idiomas;
    

    public Cartelera() {
    }

    public Cartelera(Long idPelicula,double precio, String categoria, String critica, String idiomas) {
        this.idPelicula = idPelicula;
        this.precio = precio;
        this.categoria = categoria;
        this.critica = critica;
        this.idiomas = idiomas;
      
    }
    
}
