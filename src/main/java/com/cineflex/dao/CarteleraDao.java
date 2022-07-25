/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cineflex.dao;

import com.cineflex.domain.Cartelera;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author kevin
 */
public interface CarteleraDao extends CrudRepository<Cartelera, Long> {
    
}
