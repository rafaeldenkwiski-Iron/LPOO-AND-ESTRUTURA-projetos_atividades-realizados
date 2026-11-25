/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herancaepolimorfismo;

/**
 *
 * @author LAB3
 */
public class HerancaePolimorfismo {

    public static void main(String[] args) {
        Carros onix = new Carros("Chevrolet", "Onix", 85000.00, 5);
        
        Motos hondaCG = new Motos("Honda", "Titan 125", 16000.00, 160);
        
        CaminhaoHeranca volvo = new CaminhaoHeranca("Volvo", "FH 590", 600000.00, 6);
        
        onix.exibirFicha();
        hondaCG.exibirFicha();
        volvo.exibirFicha();
        
        hondaCG.acelerar();
        hondaCG.acelerar();
        hondaCG.acelerar();
        onix.acelerar();
        onix.acelerar();
        onix.acelerar();
        volvo.acelerar();
        volvo.acelerar();
        volvo.acelerar();
        
        
        hondaCG.frear();
        hondaCG.frear();
        hondaCG.frear();
        hondaCG.frear();
        hondaCG.frear();
        hondaCG.frear();
        onix.frear();
        onix.frear();
        onix.frear();
        onix.frear();
        volvo.frear();
        volvo.frear();
        volvo.frear();
        volvo.frear();
        volvo.frear();
        volvo.frear();
        volvo.frear();
        System.out.println("========================");
        volvo.frear();
        onix.frear();
        hondaCG.frear();
    }
}
