package com.cineflex.dao;

import com.cineflex.domain.Pelicula;
import org.springframework.data.repository.CrudRepository;

public interface PeliculaDao extends CrudRepository<Pelicula, Long> {
    
}
