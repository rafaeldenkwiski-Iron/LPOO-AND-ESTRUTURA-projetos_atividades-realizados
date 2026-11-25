/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturalrdesafio2;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class EstruturaLRdesafio2 {
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
    

        

        
        int soma=0;
        
    
        System.out.println("quantas vezes para repetir");
        int n1 = teclado.nextInt();
        
        System.out.println("informe o numero");
        int n2 = teclado.nextInt();
        
        for (int i=n1;i>=1;i--) {
            
                soma=soma+n2;
  
        }
        System.out.println("Resulado da multiplicacao: "+soma);
    }
}
