/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturaaprendizagem2a3;

import java.util.Scanner;

/**
 *
 * @author LAB3
 */
public class EstruturaAprendizagem2a3 {

    public static void main(String[] args) {
        double a;
        double b;
        
        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        
        System.out.println("===INFORME O VALOR 1===");
        a=teclado1.nextDouble();        
        System.out.println("===INFORME O VALOR 2===");
        b=teclado2.nextDouble(); 
        
        if (a%b==0 || b%a==0){
            System.out.println("Sao multiplos");
        }else{
            System.out.println("Nao sao multiplos");}
    }
}
