/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetormultiplicador;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class VetorMultiplicador {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        
        int[] resultado = new int[5];
        int multiplicador;
        
        for (int i=0; i<5; i++) {
            System.out.println("INFORME OS NUMEROS");
            numeros[i]=teclado.nextInt();
        }
        
        System.out.println("INFORME O NUMERO PARA A MULTIPLICACAO");
        multiplicador=teclado.nextInt();
        
        for (int j=0; j<5; j++) {
            resultado[j]=numeros[j]*multiplicador;
        }
        
        for (int k=0; k<5; k++) {
            System.out.print(resultado[k]+", ");
        }
    }
}
