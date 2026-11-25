package com.mycompany.cartaofidalidadelpoo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB3
 */
public class Main {
    public static void main(String[] args) {
        CartaoFidalidadeLPOO conta1 = new CartaoFidalidadeLPOO("Fefe", "111.222.333-44");
        
        CartaoFidalidadeLPOO conta2 = new CartaoFidalidadeLPOO("Jar", "222.111.333-44");
        
        System.out.println("Cliente 01");
        conta1.mostrarInformacoes();
        System.out.println("--------------");
        
        System.out.println("Cliente 02");
        conta2.mostrarInformacoes();
        System.out.println("--------------");
        
        
        System.out.println("--------------");
        System.out.println("01 Compra");
        conta1.ganharpontos(500);
        System.out.println("--------------");
        System.out.println("02 Compra");
        conta2.ganharpontos(300);
        
        System.out.println("--------------");
        System.out.println("01 Resgata");
        conta1.resgatar("fone", 20);
        System.out.println("--------------");
        System.out.println("02 Resgata");
        conta2.resgatar("teclado", 15);
        
        System.out.println("--------------");
        System.out.println("01 transferir");
        conta1.transferirPontos(10, conta2);
        System.out.println("--------------");
        System.out.println("02 transferir");
        conta2.transferirPontos(5, conta1);
    }
}
