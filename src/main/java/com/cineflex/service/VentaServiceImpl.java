package com.cineflex.service;

import com.cineflex.dao.VentaDao;
import com.cineflex.domain.Venta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VentaServiceImpl implements VentaService {
    
    @Autowired
    private VentaDao ventaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Venta> getVentas() {
        
        return (List<Venta>)ventaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Venta getVenta(Venta venta) {
        return ventaDao.findById(venta.getIdVenta()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Venta venta) {
        ventaDao.save(venta);
    }

    @Override
    @Transactional
    public void delete(Venta venta) {
        ventaDao.delete(venta);
    }
}
