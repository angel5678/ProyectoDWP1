package com.cineflex.service;

import com.cineflex.domain.Venta;
import java.util.List;

public interface VentaService {
    public List<Venta> getVentas();
    
    public Venta getVenta(Venta venta);
    
    public void save(Venta venta);
    
    public void delete(Venta venta);
}
