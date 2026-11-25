/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursoshumanoshospital;

import java.util.Scanner;

/**
 *
 * @author LAB3
 */
public class RecursosHumanosHospital {

    public static void main(String[] args) {
        
        String opcao;
        
        Medico juarez = new Medico("Juarez Gonçavex Jr", "0225457445", 18000.00, "2554", 8000);
        Enfermeiro bochecha = new Enfermeiro("Bochecha", "6514695185", 12600.00, "4855", 5);
        
        
        
        Scanner teclado = new Scanner(System.in);
            System.out.println("===ESCOLHA UMA OPECAO===");
            System.out.println("--- [MEDICO] ---");
            System.out.println("--- [ENFERMEIRO] ---");
            System.out.println("---QUALQUER OUTRO VALOR PARA SAIR---");
            opcao = teclado.nextLine();
            
            switch(opcao.toLowerCase()){
                case "medico":{
                    juarez.exibirFicha();
                    break;
                }
                case "enfermeiro":{
                    bochecha.exibirFicha();
                    break;
                }
                default:{
                    System.out.println("ATE A PROXIMA");
                }
            }
        
    }
}
