/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturalratv1;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class EstruturaLRatv1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int par=0;
        int impar=0;
        
        for(int i=1; i<=3; i++){
            
            System.out.println("Informe o numero");
            int num=teclado.nextInt();
            
            if(num%2==0){
                System.out.println("O nuemro e par ");
            }else{
                System.out.println("O numero e impar");
            }
        }
        
    }
}
