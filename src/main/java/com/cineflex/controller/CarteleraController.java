/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cineflex.controller;

import com.cineflex.domain.Cartelera;
import com.cineflex.service.CarteleraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author kevin
 */
@Controller
public class CarteleraController {
    @Autowired
    private CarteleraService carteleraService;
    
//     @GetMapping("/cartelera/cartelera") // prueba es el nombre del otro archivo html 
//     public String inicio(Model model){
//         var carteleras = carteleraService.getCarteleras();
//         model.addAttribute("carteleras", carteleras);
//         return"/cartelera/cartelera";
//     }
     
     @GetMapping("/cartelera/cartelera") // prueba es el nombre del otro archivo html 
     public String inicio(){
        
         return"/cartelera/cartelera";
     }
     @GetMapping("/cartelera/horarios") // prueba es el nombre del otro archivo html 
     public String inicio2(){
        
         return"/cartelera/horario.html";
     }
    
    
     
     
      @GetMapping("/cartelera/nuevo")
    public String nuevoCartelera(Cartelera cartelera){
       return "/cartelera/agregar";
    }
    
    @PostMapping("/cartelera/guardar")
    public String guardarCartelera(Cartelera cartelera){
        carteleraService.save(cartelera);
        return"redirect:/cartelera/listado"; //DESPUES DE GUARDAR NOS RETORNA AL INICIO PARA VER LOS DATOS QUE YA HEMOS REGISTRADOS 
    }

    @GetMapping("/cartelera/agregar/{idCartelera}") // RESPONDE AL URL QUE SOLICITAMOS Y LOS TRANFORMAMOS EN idCartelera
    public String modificarCartelera(Cartelera cartelera, Model model){ // RECIBE UN OBJETO TIPO CLIENTE Y LO METEMOS EL ID EN CLIENTE
        cartelera = carteleraService.getCartelera(cartelera); // TRAE LOS DATOS
        model.addAttribute("cartelera", cartelera); // PARA MOSTRAR LOS DATOS
        return "/cartelera/agregar"; // NOS ENSEÑA ESOS DATOS
    }
     @GetMapping("/cartelera/eliminar/{idCartelera}") // recibe el id
      public String eliminarCartelera(Cartelera cartelera){ // lo registra
          carteleraService.delete(cartelera); // lo elimina
          return"redirect:/cartelera/prueba"; // para que refresque la pagina
      }
}