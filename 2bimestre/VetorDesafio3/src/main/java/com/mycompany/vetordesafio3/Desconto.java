/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.vetordesafio3;

/**
 *
 * @author rafae
 */
public interface Desconto {
    abstract double aplicarDesconto(double valorOriginal, String cupom);
    
    static boolean validarCupom(String cupom){
        if (cupom.contains("desconto")) {
            return true;
        } else {
            return false;
        }
    }
}
