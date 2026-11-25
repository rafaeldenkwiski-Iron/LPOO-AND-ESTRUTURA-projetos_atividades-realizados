/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetordesafio1;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class VetorDesafio1 {

    public static void main(String[] args) {
        int[] numero = new int[6];
        int[] pares = new int[6];
        int[] impares = new int[6];
        int vetorpares=0, vetorimpares=0;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("INFORME OS 6 NUMEROS");
        for (int i = 0; i < 6; i++) {
            numero[i]=teclado.nextInt();
        }
        
        for (int i = 0; i <6; i++){
            if(numero[i]%2==0){
                pares[vetorpares]=numero[i];
                vetorpares++;
            }else{
                impares[vetorimpares]=numero[i];
                vetorimpares++;
            }
        }
        
        System.out.println("VETORES PARES");
        for (int i = 0; i < vetorpares; i++) {
            System.out.print(pares[i]+", ");
        }
        System.out.println("");
        System.out.println("VETORES IMPARES");
        for (int i = 0; i < vetorimpares; i++) {
            System.out.print(impares[i]+", ");
        }
    }
}
    