/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.provabanco1;

import java.util.Scanner;

/**
 *
 * @author LAB3
 */
public class ProvaBanco1 {

    public static void main(String[] args) {
        String nome;
        int caloria;
        int queimaCaloriaHoj;
        double porcentagemAtingida;
       
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nome: ");
        nome=teclado.nextLine();
        System.out.println("");
        
        System.out.println("Meta caloria de Hoje: ");
        caloria=teclado.nextInt();
        System.out.println("");
        
        System.out.println("Meta de queima de caloria de Hoje: ");
        queimaCaloriaHoj=teclado.nextInt();
        System.out.println("");
        
        porcentagemAtingida=caloria*100.0/queimaCaloriaHoj;
        
        if (porcentagemAtingida>=100.0) {
            System.out.println("META BATIDA PARABENS PELO FOCO!: "+porcentagemAtingida);
        }else{
            System.out.println("FALTOU POUCO! AJUSTE O RITMO NO PROXIMO TREINO: "+porcentagemAtingida);
        }
        
    }
}
