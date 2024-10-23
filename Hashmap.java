/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
/**
 *
 * @author Netec
 */
public class Main{
    public static void main(String[] args){
    
    //hashmap me permite tomar una clave como entrada y devuelve un valor asociado 
    HashMap<String, Integer> hashMap = new HashMap<>();
    hashMap.put("Juan", 5);
    hashMap.put("Maria", 4);
    
    //acceder a un valor
    boolean contieneClave = hashMap.containsKey("Juan");
    System.out.println("Juan esta Registrado " + contieneClave);
    //int valor = hashMap.get("Juan")
    }
    
}
