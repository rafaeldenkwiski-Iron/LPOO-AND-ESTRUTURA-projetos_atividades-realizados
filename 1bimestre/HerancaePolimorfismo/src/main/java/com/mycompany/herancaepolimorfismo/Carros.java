/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaepolimorfismo;

/**
 *
 * @author LAB3
 */
public class Carros extends Veiculos{

    private int num_Portas;
    
    public Carros(String marcaCarro, String modeloCarro, double precoCarro, int numPortas){
        super(marcaCarro, modeloCarro, precoCarro);
        num_Portas=numPortas;
    }

    @Override
    public void exibirFicha(){
        super.exibirFicha();
        System.out.println("Numero de Portas: "+getNum_Portas());
    }

    @Override
    public void acelerar(){
        super.setVelocidade(super.getVelocidade()+40);
        System.out.println(super.getModelo()+" acelerou! Velocidade: "+super.getVelocidade()+" km/h");
    };
    
    @Override
    public void frear(){
        if(super.getVelocidade()>0){
            super.setVelocidade(super.getVelocidade()-30);
            System.out.println(super.getModelo()+" Desacelerou! Velocidade: "+super.getVelocidade()+" km/h");
        }else{
            System.out.println("O Veiculo "+super.getModelo()+" esta parado");
        }
    };
    
    /**
     * @return the num_Portas
     */
    public int getNum_Portas() {
        return num_Portas;
    }

    /**
     * @param num_Portas the num_Portas to set
     */
    public void setNum_Portas(int num_Portas) {
        this.num_Portas = num_Portas;
    }
    
}
