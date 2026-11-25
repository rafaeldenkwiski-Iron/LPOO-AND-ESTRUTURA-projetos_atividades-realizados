/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cabine;

/**
 *
 * @author rafae
 */
public class VeiculoEletrico extends Cabine{
    private String seloEcologico;

    public VeiculoEletrico(String placaTransporteCabine, int quantidadeEixosCabine, 
            double tarifaCabine, String seloEcologicoEletrico) {
        super(placaTransporteCabine, quantidadeEixosCabine, tarifaCabine);
        this.seloEcologico=seloEcologicoEletrico;
    }

    @Override
    public double calcularTarifaComDesconto() {
        return super.getTarifa()*0.50;
    }

    @Override
    public void emitirComprovante() {
        super.exibirDados();
        System.out.println("Selo Ecologico: "+getSeloEcologico());
        System.out.println("Desconto de 50%, Total: R$ "+calcularTarifaComDesconto());
    }

    /**
     * @return the seloEcologico
     */
    public String getSeloEcologico() {
        return seloEcologico;
    }

    /**
     * @param seloEcologico the seloEcologico to set
     */
    public void setSeloEcologico(String seloEcologico) {
        this.seloEcologico = seloEcologico;
    }
}
