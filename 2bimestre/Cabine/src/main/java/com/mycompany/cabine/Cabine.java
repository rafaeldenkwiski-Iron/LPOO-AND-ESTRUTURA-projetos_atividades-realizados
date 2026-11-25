/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cabine;

/**
 *
 * @author rafae
 */
public abstract class Cabine {
    private String placaTransporte;
    private int quantidadeEixos;
    private double tarifa;
    
    public Cabine(String placaTransporteCabine, int quantidadeEixosCabine, 
            double tarifaCabine){
    
        this.placaTransporte=placaTransporteCabine;
        this.quantidadeEixos=quantidadeEixosCabine;
        this.tarifa=quantidadeEixosCabine*6;
    }

    public abstract double calcularTarifaComDesconto(); 
    
    public abstract void emitirComprovante();
    
    public void exibirDados(){
        System.out.println("Placa: "+getPlacaTransporte());
        System.out.println("Qtd Eixos: "+getQuantidadeEixos());
        System.out.println("Valor Base: "+getTarifa());
    }
    
    /**
     * @return the placaTransporte
     */
    public String getPlacaTransporte() {
        return placaTransporte;
    }

    /**
     * @param placaTransporte the placaTransporte to set
     */
    public void setPlacaTransporte(String placaTransporte) {
        this.placaTransporte = placaTransporte;
    }

    /**
     * @return the quantidadeEixos
     */
    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    /**
     * @param quantidadeEixos the quantidadeEixos to set
     */
    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    /**
     * @return the tarifa
     */
    public double getTarifa() {
        return tarifa;
    }
}
