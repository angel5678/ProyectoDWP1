package com.cineflex.dao;

import com.cineflex.domain.Venta;
import org.springframework.data.repository.CrudRepository;

public interface VentaDao extends CrudRepository<Venta, Long> {
    
}
