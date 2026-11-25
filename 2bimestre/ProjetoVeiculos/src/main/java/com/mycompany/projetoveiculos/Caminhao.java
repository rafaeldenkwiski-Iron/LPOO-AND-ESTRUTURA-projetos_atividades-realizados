/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoveiculos;

/**
 *
 * @author rafae
 */
public class Caminhao extends Veiculos{
    private int eixos;
    
    public Caminhao(String marcaVeiculo, String modeloVeiculo, double precoVeiculo, int eixos) {
        super(marcaVeiculo, modeloVeiculo, precoVeiculo);
        this.eixos=eixos;
    }

    @Override
    public void acelerar() {
        int novaVelocidade=super.getVelocidadeAtual()+5;
        if(novaVelocidade<=120){
            super.setVelocidadeAtual(novaVelocidade);
            System.out.println("Nova velocidade km/h: "+novaVelocidade);
        }else{
            System.out.println("VELOCIDADE MAXIMA ATINGINDA km/h "+super.getVelocidadeAtual());
        }
    }

    @Override
    public void frear() {
        int novaVelocidade=super.getVelocidadeAtual()-5;
        if(novaVelocidade>0){
            super.setVelocidadeAtual(novaVelocidade);
            System.out.println("Frear km/h "+novaVelocidade);
      }else{
            super.setVelocidadeAtual(0);
            System.out.println("CAMINHAO PARADA");
        }
    }

        @Override
    public void exibirDados(){
        System.out.println("EIXOS: "+this.eixos);
    }
    
    /**
     * @return the eixos
     */
    public int getEixos() {
        return eixos;
    }

    /**
     * @param eixos the eixos to set
     */
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    
}
