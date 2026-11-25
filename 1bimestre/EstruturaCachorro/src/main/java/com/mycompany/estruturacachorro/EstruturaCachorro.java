/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturacachorro;

/**
 *
 * @author LAB3
 */
public class EstruturaCachorro {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Cachorro 1");

        Cachorros cachorro1 = new Cachorros();
        cachorro1.cor = "marrom";
        cachorro1.corOlhos = "castanhos";
        cachorro1.peso = "15 kg";
        cachorro1.idade = "4 anos";
        cachorro1.nome = "Thor";

        cachorro1.mostrarInformacoes();

        System.out.println("");
        System.out.println("Cachorro 2");

        Cachorros cachorro2 = new Cachorros();
        cachorro2.cor = "preto";
        cachorro2.corOlhos = "azuis";
        cachorro2.peso = "10 kg";
        cachorro2.idade = "2 anos";
        cachorro2.nome = "Luna";

        cachorro2.mostrarInformacoes();
    }
}