/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.petshopprova;

import java.util.Scanner;

/**
 *
 * @author LAB3
 */
public class PetShopProva {

    public static void main(String[] args) {
        Cachorro BLUE = new Cachorro("BLUE", "Rafael", 100, "RAIVA", 50);
        Gato BANOFE = new Gato("Banofe", "Katia", 100, "0932847", 5);
        
        String opcao;
        
        Scanner teclado = new Scanner(System.in);
            System.out.println("===ESCOLHA UMA OPECAO===");
            System.out.println("--- [CACHORRO] ---");
            System.out.println("--- [GATO] ---");
            System.out.println("---QUALQUER OUTRO VALOR PARA SAIR---");
            opcao = teclado.nextLine();
            
        switch (opcao.toLowerCase()) {
        case "cachorro":{
            BLUE.exibirInformacoes();
            break;
        }
        case "gato":{
            BANOFE.exibirInformacoes();
            break;
        }
        default:{
            System.out.println("ATE A PROXIMA");
        }}
        
    }
}
