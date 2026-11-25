/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetorposicao;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class VetorPosicao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] numeros= {10, 19, 2, 8, 4, 9, 20, 10, 0, 16};
        int valor;
        boolean encontrei;
        
        
        for (int i = 0; i < 10; i++) {
            encontrei=false;
            System.out.println("ADIVINHE OS NUMEROS QUE ESTAO NO VETOR!!!");
            valor=teclado.nextInt();
            
            for (int j = 0; j < 10; j++) {
                if (valor==numeros[j]) {
                    System.out.println("VALOR ENCONTRADO ");
                    System.out.println(valor+" NA POSICAO "+j);
                    encontrei=true;
                }
                
            }
            if (encontrei==false) {
                System.out.println("NUMERO NAO ENCONTRADO");
            }
            
        }
        
    }
}