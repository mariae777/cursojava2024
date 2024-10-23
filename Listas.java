/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

/**
 *
 * @author Netec
 */
// crear una lista para almacenar nombres de alumnos
public class Listas {

    public static void main(String[] args) {
        List<String> nombresAlumnos = new ArrayList<>();
        
        // el metodo main es el que va a ejcutar la tarea, entonces aqui es donde se llaman los metodos
        registrarAlumno(nombresAlumnos, "Juan");
        registrarAlumno(nombresAlumnos, "Maria");
       // eliminarAlumno (nombresAlumnos, "Juan");
        System.out.println("Juan está registrado?" + buscarAlumno(nombresAlumnos, "Juan"));
        eliminarAlumno (nombresAlumnos, "Juan");
        System.out.println("Juan está registrado?"+ buscarAlumno(nombresAlumnos, "Juan") );
    }
    //métodos: son las operaciones Básicas, registrar alumnos, búsqueda y eliminación,
    //los métodos siempre van dentron de la clase que los requiere. 
    private static void registrarAlumno(List<String> nombresAlumnos, String nombre){
        nombresAlumnos.add(nombre);
        }
    private static boolean buscarAlumno(List<String> nombresAlumnos, String nombre){
        return nombresAlumnos.contains(nombre);
        }
    private static void eliminarAlumno(List<String> nombresAlumnos, String nombre){
        nombresAlumnos.remove(nombre);
        }
}
