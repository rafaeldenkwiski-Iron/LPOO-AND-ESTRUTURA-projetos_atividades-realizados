/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturalratv4;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class EstruturaLRatv4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma=0;
        for(int i=1;i<=6;i++){
            System.out.println("Informe o numero para a Soma");
            int num=teclado.nextInt();
            soma+=num;
            
        }
        System.out.println("Resultado da Soma: "+soma);
    }
}
