package com.mycompany.biblioteca;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Netec
 */
public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int cantidadDisponnible;
    
    public Libro(String titulo, String autor, String genero, int cantidadDisponnible){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.cantidadDisponnible = cantidadDisponnible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantidadDisponnible() {
        return cantidadDisponnible;
    }

    public void setCantidadDisponnible(int cantidadDisponnible) {
        this.cantidadDisponnible = cantidadDisponnible;
    }
    
}
