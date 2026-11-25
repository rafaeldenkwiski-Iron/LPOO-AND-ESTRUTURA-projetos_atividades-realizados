/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetordesafio3;

/**
 *
 * @author rafae
 */
public class PedidoInternacional extends Pedido{

    @Override
    public double calcularFrete(double distanciaKm) {
        return distanciaKm*0.1;
    }

    @Override
    public double taxaFixa() {
        return super.taxaFixa()*3;
    }
    
}
