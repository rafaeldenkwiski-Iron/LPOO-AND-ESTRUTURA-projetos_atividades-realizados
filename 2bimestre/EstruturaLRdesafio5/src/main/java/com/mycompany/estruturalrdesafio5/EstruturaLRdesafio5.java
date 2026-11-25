/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturalrdesafio5;

/**
 *
 * @author rafae
 */
public class EstruturaLRdesafio5 {

    public static void main(String[] args) {
        
        int atual=0;
        int anterior=1;
        
        int fibonacci=0;
        
        for (int i=1; i <= 15; i++) {
            fibonacci=atual+anterior;
            anterior=atual;
            atual=fibonacci;
            
            System.out.println("F"+i+" = "+fibonacci);
        }
    }
}
