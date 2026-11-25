/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturaatividadedeaprendizagem1;

import java.util.Scanner;

/**
 *
 * @author LAB3
 */
public class EstruturaAprendizagem2a1 {
    public static void main(String[] args) {
        double n1=2;
        double n2=8;
        double resultado;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("===INFORME A OPERACAO===");
        System.out.println("=== PARA SOMA INFORME + ===");
        System.out.println("=== PARA SUBTRAIR INFORME - ===");
        System.out.println("=== PARA DIVISAO INFORME / ===");
        System.out.println("=== PARA MULTIPLICAR INFORME * ===");
        String operacao=teclado.nextLine();
        
        
        if(operacao.equals("+")){
            resultado=n1+n2;
            System.out.println("Soma dos valores: "+resultado);
        }else if(operacao.equals("-")){
            resultado=n1-n2;
            System.out.println("Subtracao dos valores: "+resultado);
        }else if(operacao.equals("/")){
            resultado=n1/n2;
            System.out.println("Divisao dos valores: "+resultado);
        }else if(operacao.equals("*")){
            resultado=n1*n2;
            System.out.println("Multiplicacao dos valores: "+resultado);
        }
    }
}
