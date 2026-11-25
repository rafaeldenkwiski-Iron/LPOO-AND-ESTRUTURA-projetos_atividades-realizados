/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetorinversa;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class VetorInversa {

    public static void main(String[] args) {
        
        int [] idades=new int[10];
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("DIGITE 10 VALORES");
        for (int i = 0; i < 10; i++) {
            idades[i]=teclado.nextInt();
        }
        for (int j = 9; j >= 0; j--) {
            System.out.print(idades[j]+", ");
        }
        
    }
}
