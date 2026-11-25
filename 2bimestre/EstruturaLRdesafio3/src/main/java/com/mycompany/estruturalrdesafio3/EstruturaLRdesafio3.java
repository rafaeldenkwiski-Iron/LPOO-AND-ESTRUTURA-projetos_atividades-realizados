/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturalrdesafio3;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class EstruturaLRdesafio3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int somapar=0;
        int somaimpar=0;
        
        for (int i=1;i<=6;i++) {
            System.out.println("Informe os numeros");
                int num = teclado.nextInt();
                
            if(num%2==0){
                somapar++;
                somapar+=num;
            }else{
                somaimpar+=num;
            }
        }
        System.out.println(""+somapar);
        System.out.println(""+somaimpar);
        }
    }