/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecturaarchivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Netec
 */
public class LecturaArchivo {
    public static void main(String[] args) {
        String archivo = "C:/Users/Netec/Documents/NetBeansProjects/archivos2/estudiante.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea;
            while ((linea= br.readLine()) != null){
                String[] datos = linea.split(",");
                // procesar los datos segun la necesidad del caso
                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);
                double promedio = Double.parseDouble(datos[2]);
                
                System.out.println(nombre+ ", " + edad+", "+promedio );
                
            }
        } catch (IOException e){
            e.printStackTrace();
        }
       
        
    }
}
