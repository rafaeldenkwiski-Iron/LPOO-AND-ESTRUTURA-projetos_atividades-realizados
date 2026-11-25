package com.mycompany.vetordesafio3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author rafae
 */
public interface Entrega {
    abstract double calcularFrete(double distanciaKm);
    
    default double taxaFixa(){
        return 5.0;
    }
}
