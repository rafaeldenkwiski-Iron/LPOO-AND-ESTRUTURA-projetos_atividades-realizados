/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturaaprendizagem2a8;

import java.util.Scanner;

/**
 *
 * @author LAB3
 */
public class EstruturaAprendizagem2a8 {

    public static void main(String[] args) {
        int idade;
        double nota;
        boolean ensino;
        
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("Qual sua idade:");
        idade= teclado1.nextInt();
        
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Ensino medio completo (SIM/NAO):");
        ensino= teclado2.nextBoolean();
        
        Scanner teclado3 = new Scanner(System.in);
        System.out.println("Nota:");
        nota= teclado3.nextDouble();
        
        if(idade>=18 && ensino==true && nota>=70){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        
    }
}
