/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listas;
//import java.util.ArrayList;
//import java.util.List;
import java.util.HashMap;
public class listas2 {
    public static void main(String[] args){
    
    //hashmap me permite tomar una clave como entrada y devuelve un valor asociado 
    HashMap<String, Integer> hashMap = new HashMap<>();
    //insertar alumnos
    hashMap.put("Juan", 5);
    hashMap.put("Maria", 4);
    
    //acceder a un valor
    int valor = hashMap.get("Juan");
        System.out.println("la calificación de Juan es " + valor);
    
    boolean contieneClave = hashMap.containsKey("Juan");
    System.out.println("Juan esta Registrado " + contieneClave);
    //int valor = hashMap.get("Juan")
    }
}
