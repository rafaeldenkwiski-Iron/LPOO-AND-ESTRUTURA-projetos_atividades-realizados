/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contacorrentelpoo;

/**
 *
 * @author LAB3
 */
public class Main {
    public static void main(String[] args) {
        ContaCorrenteLPOO conta1 = new ContaCorrenteLPOO(1234567, "Augusto Canesso", "029.902.321-09", 12345);
        
        ContaCorrenteLPOO conta2 = new ContaCorrenteLPOO(7654321, "Canesso Leandro", "021.092.123-07", 54321);
        //CRIAR CONTA PRECISA DE NUMERO, TITULAR, SALDO, CPF, SENHA
        //REGRA BANCO SAO VICENTE
        //SALDO DE 100 REAIS
     
        System.out.println("");
        conta1.setTitular("Augusto Canesso Babiuk");
        conta1.setSenha(123456789);
        
        System.out.println("");
        conta1.depositar(500);
        conta1.sacar(150.00, 123456789);
        conta1.transferir(200, conta2);
        conta1.mostrarInformacoes();
        
        System.out.println("");
        conta2.depositar(500);
        conta2.sacar(100.00, 54321);
        conta2.mostrarInformacoes();
        
        
        
    }   
}
