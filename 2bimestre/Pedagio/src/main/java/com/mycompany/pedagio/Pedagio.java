/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pedagio;


import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class Pedagio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("===Pedagios Caminhos do Sul===");
        System.out.println("Informe o Tipo de Veiculo");
        System.out.println("(CAMINHAO)|(CARRO)");
        String tipo = teclado.nextLine();
        
        switch(tipo.toLowerCase()){
            case "caminhao":{
                System.out.println("===Cadastro de caminhao===");
                System.out.println("Informe a Placa");
                String placa = teclado.nextLine();
                System.out.println("Informe a quantidade de Eixos");
                int eixos = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Informe o Nome da Transportado");
                String transportadora = teclado.nextLine();

                Caminhao mercedez = new Caminhao(placa, eixos, transportadora);
                mercedez.emitirComprovante();
                break;
            }case "carro":{
                System.out.println("===Cadastro de carro===");
                System.out.println("Informe a Placa");
                String placa = teclado.nextLine();
                System.out.println("Informe a quantidade de Eixos");
                int eixos = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Informe o selo");
                String selo = teclado.nextLine();
                
                Veiculo ronda = new Veiculo(placa, eixos, selo);
                ronda.emitirComprovante();
                break;
            
            }default:{
                System.out.println("Tente Novamente");
                break;
            }
        }
    }
    
}
