/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizarcodigo;

/**
 *
 * @author Netec
 */
public class Codigo1{
public void calcular(int x, int y, int[] datos) {
    for(int i =0; i < datos.length; i++){
        if (datos[i] > x && datos[i] < y){
            datos[i] = datos[i] * 2-1;
        } else if (datos[i] < x){
            datos[i] =Math.abs(datos[i] + x);
        }else{
            datos[i] = (int) Math.pow(datos[i], y);
        }
        }
    }
  

    
}

