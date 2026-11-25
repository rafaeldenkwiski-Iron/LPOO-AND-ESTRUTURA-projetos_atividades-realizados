/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedagio;

/**
 *
 * @author rafae
 */
public class Veiculo extends Cabine{
    private String selo;

    public Veiculo(String placaVeiculo, int quantidadeEixosVeiculos, String seloVeiculo) {
        super(placaVeiculo, quantidadeEixosVeiculos);
        this.selo=seloVeiculo;
    }

    @Override
    public double calcularTarifa() {
        return super.getValorTarifa()*0.50;
    }

    @Override
    public void emitirComprovante() {
        System.out.println("===ECOVIAS PEDAGIO===");
        System.out.println("Placa: "+super.getPlaca());
        System.out.println("Quantidade de Eixos: "+super.getQuantidade_eixos());
        System.out.println("Valor Base R$: "+super.getValorTarifa());
        System.out.println("Selo Ecologico: "+this.selo);
        System.out.println("Desconto de 50%, Total: R$ "+calcularTarifa());
    }
}
