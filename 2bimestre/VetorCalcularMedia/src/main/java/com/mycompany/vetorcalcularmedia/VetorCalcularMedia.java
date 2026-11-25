/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetorcalcularmedia;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class VetorCalcularMedia {

    public static void main(String[] args) {
       int[]numero=new int[5];
       int soma=0, media=0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe os 5 valores!");
        for (int i = 0; i < 5; i++) {
            numero[i]=teclado.nextInt();
        }
        
        for (int k = 0; k < 5; k++) {
            soma=soma+numero[k];
        }
        
        media=soma/5;
        System.out.println("MEDIA: "+media);
        System.out.println("VALORES ACIMA DA MEDIA: ");
        
        for (int j = 0; j < 5; j++) {
            if (media<numero[j]) {
                System.out.println(numero[j]+" ESTA ACIMA DA MEDIA NA POSICAO "+j);
            }
        }
    }
}
