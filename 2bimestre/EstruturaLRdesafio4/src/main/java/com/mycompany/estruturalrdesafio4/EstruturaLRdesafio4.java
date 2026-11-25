/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturalrdesafio4;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class EstruturaLRdesafio4 {

        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Fatorial");
        System.out.println("INFORME O NUMERO: ");
        int num = teclado.nextInt();
        
        int fatorial= num;
        int anterior= num-1;
        
        for (int i=num;i>1;i--) {
            fatorial=fatorial*anterior;//acumular
            anterior--;//diminuir
            
        }
        System.out.println(num+"! = "+fatorial);
    }
}
