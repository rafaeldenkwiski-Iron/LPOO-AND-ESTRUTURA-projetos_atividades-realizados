/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author rafae
 */
public class Main {
    public static void main(String[] args) {
        Cachorro filhote=new Cachorro("guapeca", "medio", 5, "caramelo");
        filhote.exibirInformacoes();
        System.out.println("========================");
        filhote.adestramento();
        System.out.println("========================");
        filhote.exibirInformacoes();
           
    }
}
