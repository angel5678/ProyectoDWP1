/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cineflex.service;

import com.cineflex.domain.Cartelera;
import java.util.List;

/**
 *
 * @author kevin
 */
public interface CarteleraService {
     public List<Cartelera> getCarteleras();
     
     public Cartelera getCartelera(Cartelera cartelera);
     
       public void save(Cartelera cartelera);
    
    public void delete(Cartelera cartelera);
}
