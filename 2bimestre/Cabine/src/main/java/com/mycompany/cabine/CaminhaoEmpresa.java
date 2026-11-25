/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cabine;

/**
 *
 * @author rafae
 */
public class CaminhaoEmpresa extends Cabine{
    private String nomeTransportadora;

    public CaminhaoEmpresa(String placaTransporteCabine, int quantidadeEixosCabine, 
            double tarifaCabine, String nomeTransportadoraCaminhao) {
        super(placaTransporteCabine, quantidadeEixosCabine, tarifaCabine);
        this.nomeTransportadora=nomeTransportadoraCaminhao;
    }

    @Override
    public double calcularTarifaComDesconto() {
       return super.getTarifa()*0.90; 
    }

    @Override
    public void emitirComprovante() {
        super.exibirDados();
        System.out.println("Nome da Empresa: "+getNomeTransportadora());
        System.out.println("Desconto de 10%, Total: R$ "+calcularTarifaComDesconto());
    }

    /**
     * @return the nomeTransportadora
     */
    public String getNomeTransportadora() {
        return nomeTransportadora;
    }

    /**
     * @param nomeTransportadora the nomeTransportadora to set
     */
    public void setNomeTransportadora(String nomeTransportadora) {
        this.nomeTransportadora = nomeTransportadora;
    }
}
