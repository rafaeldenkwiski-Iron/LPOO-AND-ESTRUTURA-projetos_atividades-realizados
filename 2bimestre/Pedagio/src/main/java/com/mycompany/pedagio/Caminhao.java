/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedagio;

/**
 *
 * @author rafae
 */
public class Caminhao extends Cabine{

    String nomeTransp;
    
    public Caminhao(String placaVeiculo, int quantidadeEixosVeiculos, String nomeTranspCaminhao) {
        super(placaVeiculo, quantidadeEixosVeiculos);
        this.nomeTransp=nomeTranspCaminhao;
    }

    @Override
    public double calcularTarifa() {
        return super.getValorTarifa()*0.90;
    }

    @Override
    public void emitirComprovante() {
        System.out.println("===ECOVIAS PEDAGIO===");
        System.out.println("Placa: "+super.getPlaca());
        System.out.println("Quantidade de Eixos: "+super.getQuantidade_eixos());
        System.out.println("Valor Base R$: "+super.getValorTarifa());
        System.out.println("Nome da Transportadora: "+this.nomeTransp);
        System.out.println("Valor com 10% de Desconto: "+calcularTarifa());
    }
    
}
