/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturalrdesafio1;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class EstruturaLRdesafio1 {

    public static void main(String[] args) {
        int maior=-999999;
        int menor=9999999;
        
        Scanner teclado = new Scanner(System.in);
        
        for(int i=1; i<=5;i++){
            System.out.println("Informe os numeros");
            int num=teclado.nextInt();
            
            if(num>maior){
                maior=num;
            }if(num<menor){
                menor=num;
            }
        }
        
        System.out.println(""+maior);
        System.out.println(""+menor);
    }
}
