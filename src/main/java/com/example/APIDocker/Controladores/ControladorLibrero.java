/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.APIDocker.Controladores;


import com.example.APIDocker.Entidades.Libros;
import com.example.APIDocker.Servicios.ServiciosLibros;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jeanm
 */
@RestController
@RequestMapping("/libreria")
public class ControladorLibrero {
    @Autowired
    ServiciosLibros SL;
    
    @GetMapping("/crud")
    public List<Libros> getTodosLosAnimales(){
    return SL.obtenerTodosLosLibros();
    }
    
    @PostMapping("/crud")
    public List<Libros> postInsertarAnimal(@RequestBody Libros L){
        
        if(SL.insertarLibro(L)){
        return SL.obtenerTodosLosLibros();
        }else{
        return null;
        }
    }
    
    @PutMapping("/crud")
    public List<Libros> puttInsertarAnimal(@RequestBody Libros L){
        
        if(SL.actualizarLibro(L)){
        return SL.obtenerTodosLosLibros();
        }else{
        return null;
        }
    }
    
    @DeleteMapping("/crud")
    public List<Libros> deleteInsertarAnimal(@RequestBody Libros L){
        
        if(SL.eliminarLibro(L)){
        return SL.obtenerTodosLosLibros();
        }else{
        return null;
        }
    }
}
