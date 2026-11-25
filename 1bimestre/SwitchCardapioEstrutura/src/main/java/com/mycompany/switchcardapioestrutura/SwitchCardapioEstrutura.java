/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchcardapioestrutura;

import java.util.Scanner;

/**
 *
 * @author LAB3
 */
public class SwitchCardapioEstrutura {

    public static void main(String[] args) {
        int opecao;
        
        int quantidade;
        double valorFinal;
        
  
        Scanner teclado = new Scanner(System.in);
            System.out.println("===ESCOLHA UMA OPECAO DO CARDAPIO===");
            System.out.println("--- 100 PARA CACHORRO QUENTE(RS 1,70) ---");
            System.out.println("--- 101 PARA BAURU SIMPLES(RS 2,30) ---");
            System.out.println("--- 102 BAURU COM OVO(RS 2,60) ---");
            System.out.println("--- 103 HAMBURGUER(RS 2,40) ---");
            System.out.println("--- 104 CHEESEBURGUER(RS 2,50) ---");
            System.out.println("--- 105 REFRIGERANTE(RS 1,00) ---");
            System.out.println("---QUALQUER OUTRO VALOR PARA SAIR");
            opecao = teclado.nextInt();
            
            System.out.println("---QUANTIDADE: ");
            quantidade = teclado.nextInt();
            
            switch(opecao){
                case 100:{
                    
                    valorFinal = (quantidade*1.70);
                    
                    System.out.println("COMPRANDO CACHORRO QUENTE, QUANTIDADE COMPRADA "+quantidade+", NO TOTAL FICA RS "+valorFinal+" REAIS, ATE A PROCIMA");
                    break;
                }
                case 101:{
                    
                    valorFinal = (quantidade*2.30);
                    
                    System.out.println("COMPRANDO BAURU SIMPLES, QUANTIDADE COMPRADA "+quantidade+", NO TOTAL FICA RS "+valorFinal+" REAIS, ATE A PROCIMA");
                    break;
                }
                case 102:{
                    
                    valorFinal = (quantidade*2.60);
                    
                    System.out.println("COMPRANDO BAURU COM OVO, QUANTIDADE COMPRADA "+quantidade+", NO TOTAL FICA RS "+valorFinal+" REAIS, ATE A PROCIMA");
                    break;
                }
                case 103:{
                    
                    valorFinal = (quantidade*2.40);
                    
                    System.out.println("COMPRANDO HAMBURGUER, QUANTIDADE COMPRADA "+quantidade+", NO TOTAL FICA RS "+valorFinal+" REAIS, ATE A PROCIMA");
                    break;
                }
                case 104:{
                    
                    valorFinal = (quantidade*2.50);
                    
                    System.out.println("COMPRANDO CHEESEBURGUER, QUANTIDADE COMPRADA "+quantidade+", NO TOTAL FICA RS "+valorFinal+" REAIS, ATE A PROCIMA");
                    break;
                }
                case 105:{
                    
                    valorFinal = (quantidade*1.00);
                    
                    System.out.println("COMPRANDO REFRIGERANTE, QUANTIDADE COMPRADA "+quantidade+", NO TOTAL FICA RS "+valorFinal+" REAIS, ATE A PROCIMA");  
                    break;
                }
                default:{
                    System.out.println("ATE A PROXIMA");
                }
            }
    }
}
