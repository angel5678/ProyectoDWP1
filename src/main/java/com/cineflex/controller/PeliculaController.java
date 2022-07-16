package com.cineflex.controller;

import com.cineflex.domain.Pelicula;
import com.cineflex.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PeliculaController {
    @Autowired
    private PeliculaService peliculaService;
    
    @GetMapping("/")
    public String inicio (Model model){
        var pelicula = peliculaService.getPeliculas();
        model.addAttribute("pelicula", pelicula);
        return "index";
    }
    
    @GetMapping("/pelicula/nuevo")
    public String nuevoPelicula(Pelicula pelicula){
        return "/pelicula/modificar";
    }
    
    @PostMapping("/pelicula/guardar")
    public String guardarPelicula(Pelicula pelicula){
        peliculaService.save(pelicula);
        return "redirect:/pelicula/listado";
    }
    
    @GetMapping("/pelicula/modificar/{idPelicula}")
    public String modificarPelicula(Pelicula pelicula, Model model){
        pelicula = peliculaService.getPelicula(pelicula);
        model.addAttribute("pelicula", pelicula);
        return "/pelicula/modificar";
    }
    
    @GetMapping("pelicula/eliminar/{idPelicula}")
    public String eliminarPelicula(Pelicula pelicula){
        peliculaService.delete(pelicula);
        return "redirect:/pelicula/listado";
    }
}
