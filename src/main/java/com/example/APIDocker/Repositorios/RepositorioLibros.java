/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.APIDocker.Repositorios;


import com.example.APIDocker.Entidades.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jeanm
 */
@Repository
public interface RepositorioLibros extends JpaRepository<Libros,Integer> {
    
}
