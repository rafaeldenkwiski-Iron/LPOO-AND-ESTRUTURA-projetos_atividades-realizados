/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetorparimpar;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class VetorParImpar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        
        
        for (int i=0; i<10; i++) {
            System.out.println("INFORME OS NUMEROS");
            numeros[i]=teclado.nextInt();
            if (numeros[i]%2==0) {
                System.out.println(numeros[i]+" e PAR");
            }
            else{
                System.out.println(numeros[i]+" e IMPAR");
            }
        }
        
    }
}
