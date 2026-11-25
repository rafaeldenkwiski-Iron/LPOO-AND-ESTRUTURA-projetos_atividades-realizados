/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedagio;

/**
 *
 * @author rafae
 */
public abstract class Cabine {
    private String placa;
    private int quantidade_eixos;
    private double valorTarifa;

    public Cabine(String placaVeiculo, int quantidadeEixosVeiculos){
    this.placa=placaVeiculo;
    this.quantidade_eixos=quantidadeEixosVeiculos;
    this.valorTarifa=quantidadeEixosVeiculos*6;
    
    };
    
    public abstract double calcularTarifa();
    
    public abstract void emitirComprovante();
    
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the quantidade_eixos
     */
    public int getQuantidade_eixos() {
        return quantidade_eixos;
    }

    /**
     * @param quantidade_eixos the quantidade_eixos to set
     */
    public void setQuantidade_eixos(int quantidade_eixos) {
        this.quantidade_eixos = quantidade_eixos;
    }

    /**
     * @return the valorTarifa
     */
    public double getValorTarifa() {
        return valorTarifa;
    }
    
    
}
