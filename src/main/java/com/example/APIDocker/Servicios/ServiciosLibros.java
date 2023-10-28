/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.APIDocker.Servicios;


import com.example.APIDocker.Entidades.Libros;
import com.example.APIDocker.Repositorios.RepositorioLibros;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jeanm
 */
@Service
public class ServiciosLibros {
    @Autowired
    RepositorioLibros RL;
    
    public List<Libros> obtenerTodosLosLibros(){
    return RL.findAll();
    }
    
    
    public boolean insertarLibro(Libros L){
    boolean respuesta = false;
    try{
    RL.save(L); //insert o update a base de datos
    respuesta = true;
    }catch(Exception ex){
        respuesta=false;
    }
    
    return respuesta;
    }
    
    
    public boolean actualizarLibro(Libros L){
    boolean respuesta = false;
    try{
    RL.save(L); //insert o update a base de datos
    respuesta = true;
    }catch(Exception ex){
        respuesta=false;
    }
    
    return respuesta;
    }
    
    
    public boolean eliminarLibro(Libros L){
    boolean respuesta = false;
    try{
    RL.delete(L); //insert o update a base de datos
    respuesta = true;
    }catch(Exception ex){
        respuesta=false;
    }
    
    return respuesta;
    }
    
    
}
