/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaepolimorfismo;

/**
 *
 * @author LAB3
 */
public class CaminhaoHeranca extends Veiculos{
    
    private int quantidadeDeEixos;
    
    public CaminhaoHeranca(String marcaCaminhao, String modeloCaminhao, double precoCaminhao, int quantidadeDeEixosCaminhao ){
        super(marcaCaminhao,modeloCaminhao,precoCaminhao);
        quantidadeDeEixos=quantidadeDeEixosCaminhao;
    }

    @Override
    public void exibirFicha(){
        super.exibirFicha();
        System.out.println("QUANTIDADE DE EIXO: "+getQuantidadeDeEixos());
    };
    
    @Override
    public void acelerar(){
        super.setVelocidade(super.getVelocidade()+10);
        System.out.println(super.getModelo()+" acelerou! Velocidade: "+super.getVelocidade()+" km/h");
    };
    
    @Override
    public void frear(){
        if(super.getVelocidade()>0){
            super.setVelocidade(super.getVelocidade()-5);
            System.out.println(super.getModelo()+" Desacelerou! Velocidade: "+super.getVelocidade()+" km/h");
        }else{
            System.out.println("O Veiculo "+super.getModelo()+" esta parado");
        }
    };
    
    
    /**
     * @return the quantidadeDeEixos
     */
    public int getQuantidadeDeEixos() {
        return quantidadeDeEixos;
    }

    /**
     * @param quantidadeDeEixos the quantidadeDeEixos to set
     */
    public void setQuantidadeDeEixos(int quantidadeDeEixos) {
        this.quantidadeDeEixos = quantidadeDeEixos;
    }
    
}
