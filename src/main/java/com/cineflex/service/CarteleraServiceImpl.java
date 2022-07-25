/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cineflex.service;

import com.cineflex.dao.CarteleraDao;
import com.cineflex.domain.Cartelera;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kevin
 */


@Service
public class CarteleraServiceImpl implements CarteleraService {

    @Autowired
     private CarteleraDao carteleraDao;
    
   
    
    @Override
    @Transactional (readOnly = true)
    public List<Cartelera> getCarteleras() {
       return (List<Cartelera>)carteleraDao.findAll();
    
    }

    @Override
     @Transactional (readOnly = true)
    public Cartelera getCartelera(Cartelera cartelera) {
      return carteleraDao.findById(cartelera.getIdPelicula()). orElse(null);
    }

    @Override
    @Transactional 
    public void save(Cartelera cartelera) {
      carteleraDao.save(cartelera);
    }

    @Override
    @Transactional 
    public void delete(Cartelera cartelera) {
       carteleraDao.delete(cartelera);
    }



}