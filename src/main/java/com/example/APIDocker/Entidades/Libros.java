/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.APIDocker.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author jeanm
 */
@Entity
@Table (name="libros")
public class Libros {
    @Id
    private int IDLibro;
    @Column(length=50)
    String Nombre;
    String Autor;
    int NúmeroDePáginas;
    String Editorial;
    String Idioma;

    public Libros(int IDLibro, String Nombre, String Autor, int NúmeroDePáginas, String Editorial, String Idioma) {
        this.IDLibro = IDLibro;
        this.Nombre = Nombre;
        this.Autor = Autor;
        this.NúmeroDePáginas = NúmeroDePáginas;
        this.Editorial = Editorial;
        this.Idioma = Idioma;
    }

    public Libros() {
    }

    public int getIDLibro() {
        return IDLibro;
    }

    public void setIDLibro(int IDLibro) {
        this.IDLibro = IDLibro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNúmeroDePáginas() {
        return NúmeroDePáginas;
    }

    public void setNúmeroDePáginas(int NúmeroDePáginas) {
        this.NúmeroDePáginas = NúmeroDePáginas;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }
    
    
    
    
    
}
