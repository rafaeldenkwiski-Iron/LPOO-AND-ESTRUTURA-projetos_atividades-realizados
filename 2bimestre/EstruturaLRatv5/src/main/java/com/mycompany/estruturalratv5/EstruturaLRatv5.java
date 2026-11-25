/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturalratv5;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class EstruturaLRatv5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("====TABUADA====");
        System.out.println("Informe o numero");
        int num = teclado.nextInt();
        
        System.out.println("Informe o inicio da tabuada");
        int inicio=teclado.nextInt();
        
        System.out.println("Informe o fim da tabuada");
        int fim=teclado.nextInt();
        
        for(int i=inicio; i<=fim; i++){
            System.out.println(num+" x "+i+" = "+num*i);
        }
            
    }
}

