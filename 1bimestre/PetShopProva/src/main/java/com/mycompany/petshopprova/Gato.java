/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshopprova;

/**
 *
 * @author LAB3
 */
public class Gato extends Animal{
    private String chipID;
    private int diasExtra;
    
    public Gato(String pet_nome, String dono_nome,double diariaHosp, String identificacao, int diaria){
    super(pet_nome, dono_nome, diariaHosp);
    chipID=identificacao;
    diasExtra=diaria;
    };

    @Override
    public double calcularPagamentoFinal(){
        return super.getDiariaHosp()+getDiasExtra()*40;
    };
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("CHIP DE IDENTIFICACAO: "+getChipID());
        System.out.println("TAXA DE DIAS EXTRAS: "+getDiasExtra());
        System.out.println("VALOR FINAL: "+this.calcularPagamentoFinal());
    };
    
    /**
     * @return the chipID
     */
    public String getChipID() {
        return chipID;
    }

    /**
     * @param chipID the chipID to set
     */
    public void setChipID(String chipID) {
        this.chipID = chipID;
    }

    /**
     * @return the diasExtra
     */
    public int getDiasExtra() {
        return diasExtra;
    }

    /**
     * @param diasExtra the diasExtra to set
     */
    public void setDiasExtra(int diasExtra) {
        this.diasExtra = diasExtra;
    }
}
