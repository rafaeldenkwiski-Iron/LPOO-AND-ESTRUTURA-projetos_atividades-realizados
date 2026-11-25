/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturalratv3;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class EstruturaLRatv3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double media;
        int par=0;
        int somaimpar=0;
        int somapar=0;
        
        for(int i=1; i<=5; i++){
            System.out.println("INFORME UM NUMERO");
            int num = teclado.nextInt();
            
            if(num%2==0){
                par++;
                somapar+=num;
            }else{
                somaimpar+=num;
            }
        }
        media=somapar/par;
            System.out.println("Media dos numeros pares "+media);
            System.out.println("Soma dos numeros impares "+somaimpar);
    }
}
