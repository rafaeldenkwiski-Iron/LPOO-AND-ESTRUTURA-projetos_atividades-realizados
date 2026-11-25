/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturadesafio2a1;

import java.util.Scanner;

/**
 *
 * @author LAB3
 */
public class EstruturaDesafio2a1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double saldo = 100.00;
        
        System.out.println("===Banco Escolar===");
        System.out.println("1 - ver saldo");
        System.out.println("2 - realizar deposito");
        System.out.println("3 - realizar saque");
        System.out.println("Escolha a operacao desejada: ");
        int opcao = teclado.nextInt();
        
        if (opcao==1){
            System.out.println("Seu saldo atual e: "+saldo);
        }else if(opcao==2){
            System.out.println("Digite o valor que deseja depositar: ");
            double deposito=teclado.nextDouble();
            saldo = saldo+deposito;
            System.out.println("Deposito realizado, Novo saldo: "+saldo);
        }else if(opcao==3){
            System.out.println("Digite o valor que deseja sacar: ");
            double saque=teclado.nextDouble();
            
            if(saque<=saldo){
                saldo=saldo-saque;
                System.out.println("Saque realizado com sucesso, Retire seu dinheiro");
                System.out.println("Saldo restante: "+saldo);
            }else{
                System.out.println("Saldo insuficiente!");
            }
            
        }else{
            System.out.println("Erro opcao invalida escolha 1, 2 ou 3");
        }
        teclado.close();
        
    }
}
