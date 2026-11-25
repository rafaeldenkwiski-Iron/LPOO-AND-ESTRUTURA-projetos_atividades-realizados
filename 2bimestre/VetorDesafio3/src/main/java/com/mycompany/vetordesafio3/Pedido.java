/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetordesafio3;

/**
 *
 * @author rafae
 */
public class Pedido implements Desconto, Entrega{
    double valorProdutos;

    public double getValorProdutos() {
        return valorProdutos;
    }
    
    
    @Override
    public double aplicarDesconto(double valorOriginal, String cupom) {
        if(Desconto.validarCupom(cupom)==true){
            System.out.println("===================================");
            System.out.println("======CUPOM VALIDADO===============");
            System.out.println("===================================");
            System.out.println("VALOR ORIGINAL R$ "+valorOriginal);
            double desc=valorOriginal*0.1;
            System.out.println("VALOR DO DESCONTO R$ "+desc);
            
            return valorOriginal-desc;
        }else{
            System.out.println("=============================");
            System.out.println("======CUPOM NAO VALIDADO=====");
            System.out.println("=============================");
            System.out.println("VALOR ORIGINAL R$ "+valorOriginal);
            return valorOriginal;
        }
    }

    @Override
    public double calcularFrete(double distanciaKm) {
        return distanciaKm*0.3;
    }
    
}
