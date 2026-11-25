/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetormaiormenor;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class VetorMaiorMenor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] numeros=new int[5];
        
        int maior=-999999999;
        int menor=1000000000;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("INFORME OS NUMEROS");
            numeros[i]=teclado.nextInt();
            
            if (numeros[i]>maior) {
                maior=numeros[i];
            }
            if (numeros[i]<menor){
                menor=numeros[i];
            }
        }
        System.err.println("");
        System.out.println("MAIOR VALOR: "+maior);
        System.out.println("MENOR VALOR: "+menor);
    }
}
