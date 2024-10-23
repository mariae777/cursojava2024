/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operaciones;

import java.util.Scanner;

/**
 *
 * @author Netec
 */
public class Operaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dividendo:");
        
        String valor = scanner.nextLine();
        //int num = Integer.parseInt(valor);
        int dividendo = Integer.parseInt(valor);
        System.out.print("Ingrese el divisor: ");
        int divisor =Integer.parseInt(scanner.nextLine());
        try{
            double resultado = divisor !=0 ?(double)dividendo/divisor :0;
            System.out.println("el resultado de la division es: " + resultado);
        }
        catch (ArithmeticException e){
            System.out.println("Error: No se puede dividir por cero");
        } finally{
            System.out.println("Se ejecuta programa");
        }
    }
}
