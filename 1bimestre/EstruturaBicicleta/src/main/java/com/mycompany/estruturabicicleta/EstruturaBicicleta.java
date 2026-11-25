/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturabicicleta;

/**
 *
 * @author LAB3
 */
public class EstruturaBicicleta {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Bicicleta 1");
        Bicicletas bicicleta1 = new Bicicletas();
        bicicleta1.banco="banco esportivo";
        bicicleta1.guidao="guidao reto";
        bicicleta1.freio="freio a disco";
        bicicleta1.marca="Caloi";
        bicicleta1.roda="2 rodas aro 29";
        
        bicicleta1.mostrarInformacoes();
        
        System.out.println("");
        System.out.println("Bicicleta 2");
        Bicicletas bicicleta2 = new Bicicletas();
        bicicleta2.banco="banco confortavel";
        bicicleta2.guidao="guidao curvo";
        bicicleta2.freio="freio V-Brake";
        bicicleta2.marca="Monark";
        bicicleta2.roda="2 rodas aro 26";
        
        bicicleta2.mostrarInformacoes();
    }
}