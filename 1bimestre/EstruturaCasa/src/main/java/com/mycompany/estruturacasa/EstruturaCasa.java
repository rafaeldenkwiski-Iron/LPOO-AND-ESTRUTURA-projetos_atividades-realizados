/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturacasa;

/**
 *
 * @author LAB3
 */
public class EstruturaCasa {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Casa 1");
        Casas casa1 = new Casas();
        casa1.janela=": 6 janelas";
        casa1.porta="3 portas";
        casa1.chamine="chamine de 1 metro";
        casa1.churrasqueira="sem churrasqueira";
        casa1.garagem=",com garagem";
        casa1.muro="muro de 2 metros";
        casa1.comodos="6 comodos";
        
        casa1.mostrarInformacoes();
        
        
        System.out.println("");
        System.out.println("Casa 2");
        Casas casa2 = new Casas();
        casa2.janela=": 4 janelas";
        casa2.porta="2 portas";
        casa2.chamine="chamine de 2 metro";
        casa2.churrasqueira="com churrasqueira";
        casa2.garagem="sem garagem";
        casa2.muro="sem muro";
        casa2.comodos="9 comodos";
        
        casa2.mostrarInformacoes();
    }
}
