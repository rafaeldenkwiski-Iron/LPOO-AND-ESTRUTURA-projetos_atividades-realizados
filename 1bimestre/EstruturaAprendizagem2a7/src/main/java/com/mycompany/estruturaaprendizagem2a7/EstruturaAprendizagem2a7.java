/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturaaprendizagem2a7;

import java.util.Scanner;

/**
 *
 * @author LAB3
 */
public class EstruturaAprendizagem2a7 {

    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o valor 1");
        n1=teclado.nextInt();
        
        System.out.println("informe o valor 2");
        n2=teclado.nextInt();
        
        System.out.println("informe o valor 3");
        n3=teclado.nextInt();
        
        if (n1>=n2 && n1>=n3){
            System.out.println("Maior numero "+n1);
        }else if (n2>=n1 && n2>=n3){
            System.out.println("Maior numero "+n2);
        }else{
            System.out.println("Maior numero "+n3);
        }
    }
}
