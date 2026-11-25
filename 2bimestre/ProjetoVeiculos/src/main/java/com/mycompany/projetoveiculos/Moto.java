/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoveiculos;

/**
 *
 * @author rafae
 */
public class Moto extends Veiculos{
    private int cilindradas;
    
    public Moto(String marcaVeiculo, String modeloVeiculo, double precoVeiculo, double velocidadeAtualVeiculo,int cilindradas) {
        super(marcaVeiculo, modeloVeiculo, precoVeiculo);
        this.cilindradas=cilindradas;
    }

    @Override
    public void acelerar() {
        int novaVelocidade=super.getVelocidadeAtual()+20;
        if(novaVelocidade<=300){
            super.setVelocidadeAtual(novaVelocidade);
            System.out.println("Nova velocidade km/h: "+novaVelocidade);
        }else{
            System.out.println("VELOCIDADE MAXIMA ATINGINDA km/h "+super.getVelocidadeAtual());
        }
    }

    @Override
    public void frear() {
        int novaVelocidade=super.getVelocidadeAtual()-20;
        if(novaVelocidade>0){
            super.setVelocidadeAtual(novaVelocidade);
            System.out.println("Frear km/h "+novaVelocidade);
      }else{
            super.setVelocidadeAtual(0);
            System.out.println("MOTO PARADA");
        }
    }

    @Override
    public void exibirDados(){
        System.out.println("CILINDRADAS: "+this.cilindradas);
    }
    
    /**
     * @return the cilindradas
     */
    public int getCilindradas() {
        return cilindradas;
    }

    /**
     * @param cilindradas the cilindradas to set
     */
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
}
