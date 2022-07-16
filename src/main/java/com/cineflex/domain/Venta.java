package com.cineflex.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="venta")
public class Venta implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVenta; //id_velicula
    private Long idFactura; //id_factura
    private Long idPelicula; //id_pelicula
    private Long idComida; //id_comida
    private double precio;
    private int cantidad;

    public Venta() {
    }

    public Venta(Long idFactura, Long idPelicula, Long idComida, double precio, int cantidad) {
        this.idFactura = idFactura;
        this.idPelicula = idPelicula;
        this.idComida = idComida;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
}
