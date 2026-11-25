/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturaaprendizagem2a5;

import java.util.Scanner;

/**
 *
 * @author LAB3
 */
public class EstruturaAprendizagem2a5 {

    public static void main(String[] args) {
        int n1;
        
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("===Informe um numero===");
        n1=teclado1.nextInt();
        
        if (n1%2==0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
        
        if (n1>=0){
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo");
        }
    }
}
