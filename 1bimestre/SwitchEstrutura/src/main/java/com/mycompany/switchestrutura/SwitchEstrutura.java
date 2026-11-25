/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchestrutura;

import java.util.Scanner;

/**
 *
 * @author LAB3
 */
public class SwitchEstrutura {

    public static void main(String[] args) {
        int opecao;
        
        
        
        
        
        Scanner teclado = new Scanner(System.in);
            System.out.println("===ESCOLHA UMA OPECAO===");
            System.out.println("--- 1 PARA CADASTRAR ALUNO ---");
            System.out.println("--- 2 PARA LISTAR ALUNO ---");
            System.out.println("--- 3 PARA PESQUISAR ALUNO ---");
            System.out.println("---QUALQUER OUTRO VALOR PARA SAIR---");
            opecao = teclado.nextInt();
            
            switch(opecao){
                case 1:{
                    System.out.println("CADASTRO REALIZADO COM SUCESSO");
                    break;
                }
                case 2:{
                    System.out.println("LISTANDO ALUNOS...");
                    break;
                }
                case 3:{
                    System.out.println("PERQUISANDO ALUNOS...");
                    break;
                }
                default:{
                    System.out.println("ATE A PROXIMA");
                }
            }
    }
}
    