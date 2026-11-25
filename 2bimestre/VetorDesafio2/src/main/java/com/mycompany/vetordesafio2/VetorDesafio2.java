/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetordesafio2;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class VetorDesafio2 {

    public static void main(String[] args) {
        
        String[] gabarito = {"a","a","a","a","a","a","a","a","a","a"};
        String[] prova = new String[10];
        int correto=0;
        int errado=0;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("INFORME AS RESPOSTAS MARCADAS");
        for (int i = 0; i < 10; i++) {
            prova[i]=teclado.nextLine(); 
        }
        
            for (int j = 0; j < 10; j++) {
                if(prova[j].equalsIgnoreCase(gabarito[j])){
                    System.out.println("RESPOSTA DO GABARITO "+gabarito[j]);
                    System.out.println("RESPOSTA DO PROVA "+prova[j]);
                    System.out.println("Voce acertou!");
                    correto++;
                    System.out.println("");
                }else{
                    System.out.println("RESPOSTA DO GABARITO "+gabarito[j]);
                    System.out.println("RESPOSTA DO PROVA "+prova[j]);
                    System.out.println("Voce errou!");
                    errado++;
                    System.out.println("");
                }
            }
        
        System.out.println("");
        System.out.println("Voce acertou "+correto+" das 10 questoes");
        
        System.out.println("");
         System.out.println("Voce errou "+errado+" das 10 questoes");
    }
}
