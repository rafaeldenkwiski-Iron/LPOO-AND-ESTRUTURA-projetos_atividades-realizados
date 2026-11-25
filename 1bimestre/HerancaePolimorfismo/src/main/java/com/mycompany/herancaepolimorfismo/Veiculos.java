/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaepolimorfismo;

/**
 *
 * @author LAB3
 */
public class Veiculos {
    private String marca;
    private String modelo;
    private double preco;
    private int velocidade;
    private int frear;
    
    public Veiculos(String marcaVeiculo, String modeloVeiculo, double precoVeiculo){
        marca=marcaVeiculo;
        modelo=modeloVeiculo;
        preco=precoVeiculo;
        velocidade=0;
    }

    public void exibirFicha(){
        System.out.println("=== DADOS DO VEICULO ===");
        System.out.println("MARCA: "+getMarca());
        System.out.println("MODELO: "+getModelo());
        System.out.println("PRECO R$: " + String.format("%.2f", getPreco()));

    }
    
    public void acelerar(){
        this.setVelocidade(this.getVelocidade() + 10);
        System.out.println(this.modelo+" acelerou! Velocidade: "+ this.getVelocidade()+" km/h");
    }
    
    public void frear(){
        if(velocidade>0){
            this.setVelocidade(this.getVelocidade()-10);
            System.out.println(this.modelo+" Desacelerou! Velocidade: "+ this.getVelocidade()+" km/h");
        }else{
            System.out.println("O Veiculo "+this.modelo+" esta parado");
        }
    };
    
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the velocidade
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * @return the frear
     */
    public int getFrear() {
        return frear;
    }

    /**
     * @param frear the frear to set
     */
    public void setFrear(int frear) {
        this.frear = frear;
    }
}
