/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entretenimento;

import java.util.Scanner;

/**
 *
 * @author rafae
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        PlanoPadrao padrao = new PlanoPadrao("Gaga", "Gaga@email.com", false, 2);

        PlanoPremium premium = new PlanoPremium("Diogro", "Diogro@email.com", "AMIGO123");

        System.out.println("Digite o plano (padrao ou premium):");
        String opcao = teclado.next();

        
        switch (opcao.toLowerCase()) {
            case "padrao":
                padrao.exibirFichaConta();
                break;

            case "premium":
                premium.exibirFichaConta();
                break;

            default:
                System.out.println("Opcao invalida.");
                break;
        }

        teclado.close();
    }
}

