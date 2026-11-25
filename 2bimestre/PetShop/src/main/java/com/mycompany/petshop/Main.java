/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class Main {
    public static void main(String[] args) {
        Cachorro snoopy=new Cachorro("Snoopy", "Charlie Brown", 120.00, "gd634883", 60.00);
        Gato garfield=new Gato("Garfield", "Jon", 100.00, "td1892383", 4);
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("===PETSHOP ANIMAL===");
        System.out.println("ESCOLHA O ANIMAL");
        System.out.println("[CACHORRO]");
        System.out.println("[GATO]");
        String opcao=teclado.next();
        
        switch(opcao.toLowerCase()){
            case "cachorro":{
                garfield.exibirInformacoes();
                break;
            }
            case "gato":{
                snoopy.exibirInformacoes();
                break;
            }
            default:{
                System.out.println("Hora de dar Tchau...");
                break;
            }
        }
        
    }
}
