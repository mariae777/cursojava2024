/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.archivos2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Netec
 */
public class Archivos2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de estudiantes a guardar: " );
        int cantidadEstudiantes = scanner.nextInt();
        scanner.nextLine();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("estudiante.txt"));
            for (int i=0; i<cantidadEstudiantes; i++){
                System.out.println("Ingrese los datos del Estudiante (Nombre, Edad, promedio): ");
                String datosEstudiante  = scanner.nextLine();
                writer.write(datosEstudiante);
                writer.newLine();
            }
            writer.close();  //cerrar el archivo
            System.out.println("Datos de estudiantes Guardados correctamente en el archivo ");
        }catch (IOException e){
            System.err.println("Error al escribir en el archivo " + e.getMessage());
        }finally{
            scanner.close();
        }
        
        
        
    }
}
