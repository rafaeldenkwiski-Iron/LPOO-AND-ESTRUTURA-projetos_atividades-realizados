/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop;

/**
 *
 * @author rafae
 */
public class Cachorro extends Animal{
    private String carteirinha;
    private double adestramento;
    
    public Cachorro(String nomeA, String nomeD, double valorD, String carteirinha, double adestramento) {
        super(nomeA, nomeD, valorD);
        this.carteirinha=carteirinha;
        this.adestramento=adestramento;
    }

    /**
     *
     * @return
     */
    @Override
    public double calcularPagamentoFinal(){
        return super.getValorDiaria()+this.adestramento;
    }
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("NUMERO CARTEIRINHA: "+this.carteirinha);
        System.out.println("TAXA ADESTRAMENTO: "+this.adestramento);
        System.out.println("VALOR FINAL: "+this.calcularPagamentoFinal());
    }
    
    
    /**
     * @return the carteirinha
     */
    public String getCarteirinha() {
        return carteirinha;
    }

    /**
     * @param carteirinha the carteirinha to set
     */
    public void setCarteirinha(String carteirinha) {
        this.carteirinha = carteirinha;
    }

    /**
     * @return the adestramento
     */
    public double getAdestramento() {
        return adestramento;
    }

    /**
     * @param adestramento the adestramento to set
     */
    public void setAdestramento(double adestramento) {
        this.adestramento = adestramento;
    }
    
}
