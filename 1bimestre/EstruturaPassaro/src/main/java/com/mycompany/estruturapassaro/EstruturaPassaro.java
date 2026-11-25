/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturapassaro;

/**
 *
 * @author LAB3
 */

public class EstruturaPassaro {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Passaro 1");
        Passaros passaro1 = new Passaros();
        passaro1.cor = "amarelo";
        passaro1.corPenas = "amarelas";
        passaro1.peso = "120 g";
        passaro1.idade = "2 anos";
        passaro1.nome = "Piu";

        passaro1.mostrarInformacoes();

        System.out.println("");
        System.out.println("Passaro 2");
        Passaros passaro2 = new Passaros();
        passaro2.cor = "azul";
        passaro2.corPenas = "azuis";
        passaro2.peso = "150 g";
        passaro2.idade = "3 anos";
        passaro2.nome = "Azulao";

        passaro2.mostrarInformacoes();
    }
}
