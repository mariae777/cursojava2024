/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

/**
 *
 * @author Netec
 */
public class Biblioteca {

    public static void main(String[] args) {
        System.out.println("Bienvenido");
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", "Realismo Mágico", 5);
        System.out.println("Titulo: "+ libro1.getTitulo());
        System.out.println("Autor: "+ libro1.getAutor());
        System.out.println("Genero: " + libro1.getGenero());
        System.out.println("Cantidad Disponible: " + libro1.getCantidadDisponnible());
        
        
    }
}
