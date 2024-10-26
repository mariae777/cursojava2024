/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listanumeros;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Listanumeros {

    public static void main(String[] args) {
        List<Integer> numeros =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> numerosPares =numeros.stream()
                .filter(numero -> numero% 2 ==0)
                .collect(Collectors.toList());
        System.out.println("Números Originales: " + numeros);
        System.out.println("Números Pares: " + numerosPares);
        //System.out.println("Hello World!");
    }
}
