package com.cineflex.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="pelicula")
public class Pelicula implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPelicula; //id_pelicula
    private double precio;
    private String categoria;
    private String critica;
    private String idiomas;

    public Pelicula() {
    }

    public Pelicula(double precio, String categoria, String critica, String idiomas) {
        this.precio = precio;
        this.categoria = categoria;
        this.critica = critica;
        this.idiomas = idiomas;
    }
    
}
