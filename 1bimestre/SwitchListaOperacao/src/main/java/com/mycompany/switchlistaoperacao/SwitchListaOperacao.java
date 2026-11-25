/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchlistaoperacao;

import java.util.Scanner;

/**
 *
 * @author LAB3
 */
public class SwitchListaOperacao {

    public static void main(String[] args) {
        int opecao;
        
        int n1;        
        int n2;
        
        double resultado;
        
        
            
        
        Scanner teclado = new Scanner(System.in);
            System.out.println("===ESCOLHA UMA OPECAO===");
            System.out.println("--- 1 MEDIA ENTRE OS NUMEROS DIGITADOS ---");
            System.out.println("--- 2 DIFERENCA ENTRE OS NUMEROS ---");
            System.out.println("--- 3 PRODUTOS ENTRE OS NUMEROS DIGITADOS ---");
            System.out.println("--- 4 DIVISAO DO PRIMEIRO PELO SEGUNDO ---");
            opecao = teclado.nextInt();
            
            System.out.println("--- DIGITE O PRIMERO NUMERO ---");
            n1 = teclado.nextInt();
            System.out.println("--- DIGITE O SEGUNDO NUMERO ---");
            n2 = teclado.nextInt();
            
            switch(opecao){
                case 1:{
                    resultado=(n1+n2)/2;
                    System.out.println("MEDIA: "+resultado);
                    break;
                }
                case 2:{
                    resultado=(n1-n2);
                    System.out.println("DIFERENCA: "+resultado);
                    break;
                }
                case 3:{
                    resultado=(n1*n2);
                    System.out.println("PRODUTO: "+resultado);
                    break;
                }
                case 4:{            
                    System.out.println("DIVISAO: "+n1/n2);
                    break;
                }
                default:{
                    System.out.println("ATE A PROXIMA");
                }
            }
    }
}
