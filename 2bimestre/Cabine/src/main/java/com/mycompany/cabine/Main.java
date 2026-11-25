/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cabine;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class Main {

    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in); 
        System.out.println("Escolhe uma Opcao");
        System.out.println("[CAMINHAO] OU [ELETRICO]");
        String opcao=teclado.nextLine();
        
        
            CaminhaoEmpresa caminhao = new CaminhaoEmpresa("AJI132S", 8, 50, "Correios");
    
            VeiculoEletrico eletrico = new VeiculoEletrico("ASISD901", 4, 24, "Carbono Neutro");
        
        switch(opcao.toLowerCase()){
            case "caminhao": {
                System.out.println("Comprovante Corporativo");
                caminhao.emitirComprovante();
                break;
            }
            case "eletrico": {
                System.out.println("Comprovante Ecologico");
                eletrico.emitirComprovante();
                break;
            }
            default: {
                System.out.println("Tente novamente...");
            }
        }
    }
    
    
}
