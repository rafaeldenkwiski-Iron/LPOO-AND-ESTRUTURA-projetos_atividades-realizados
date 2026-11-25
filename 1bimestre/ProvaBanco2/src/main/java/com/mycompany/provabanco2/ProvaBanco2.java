/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.provabanco2;

import java.util.Scanner;

/**
 *
 * @author LAB3
 */
public class ProvaBanco2 {

    public static void main(String[] args) {
        String nome;
        String destino;
        String opcao;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("NOME: ");
        nome=teclado.nextLine();
        System.out.println("");
        
        System.out.println("===ESCOLHA UMA OPECAO===");
        System.out.println("--- [PRAIA] ---");
        System.out.println("--- [CAMPO] ---");
        System.out.println("--- [MONTANHA] ---");
        System.out.println("---QUALQUER OUTRO VALOR PARA SAIR---");
        opcao = teclado.nextLine();
            
            switch(opcao.toLowerCase()){
                case "praia":{
                    double destinoPraia=1500.0;
                    
                    System.out.println("NOME: "+nome+", DESTINO: "+opcao+", VALOR TOTAL DESTA VIAGEM: "+destinoPraia);
                    break;
                }
                case "campo":{
                    double destinoCampo=1200.0;
                    
                    System.out.println("NOME: "+nome+", DESTINO: "+opcao+", VALOR TOTAL DESTA VIAGEM: "+destinoCampo);
                    break;
                }
                case "montanha":{
                    double destinoMontanha=1800.0;
                    
                    System.out.println("NOME: "+nome+", DESTINO: "+opcao+", VALOR TOTAL DESTA VIAGEM: "+destinoMontanha);
                    break;
                }
                default:{
                    System.out.println("DESTINO INDISPONIVEL EM NOSSO CATALAGO!");
                    return;
                }
            }
    }
}
