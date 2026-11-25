/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetorsomavalores;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class VetorSomaValores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] numeros= new int[4];
        int soma=0;
        
        for (int i = 0; i < 4; i++) {
            System.out.println("INFORME OS NUMEROS");
            numeros[i]=teclado.nextInt();
        }
        
        for (int j = 0; j < 4; j++) {
            soma=numeros[j]+soma;
        }
        
        System.out.println("SOMA DOS VALORES JUNTOS "+soma);
        
    }
}
