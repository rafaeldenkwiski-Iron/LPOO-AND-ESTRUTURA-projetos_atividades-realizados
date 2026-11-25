/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshopprova;

/**
 *
 * @author LAB3
 */
public class Animal {
    private String pet_nome;
    private String dono_nome;
    private double diariaHosp;
    
    public Animal(String petNome, String donoNome, double diariaBase){
        pet_nome=petNome;
        dono_nome=donoNome;
        diariaHosp=diariaBase;
    };

    public double calcularPagamentoFinal(){
        return getDiariaHosp();
    };
    
    public void exibirInformacoes(){
        System.out.println("NOME DO PET: "+getPet_nome());
        System.out.println("NOME DO DONO: "+getDono_nome());
        System.out.println("VALOR BASE DO SERVICO: "+getDiariaHosp());
    };
    
    
    /**
     * @return the pet_nome
     */
    public String getPet_nome() {
        return pet_nome;
    }

    /**
     * @param pet_nome the pet_nome to set
     */
    public void setPet_nome(String pet_nome) {
        this.pet_nome = pet_nome;
    }

    /**
     * @return the dono_nome
     */
    public String getDono_nome() {
        return dono_nome;
    }

    /**
     * @param dono_nome the dono_nome to set
     */
    public void setDono_nome(String dono_nome) {
        this.dono_nome = dono_nome;
    }

    /**
     * @return the diariaHosp
     */
    public double getDiariaHosp() {
        return diariaHosp;
    }

    /**
     * @param diariaHosp the diariaHosp to set
     */
    public void setDiariaHosp(double diariaHosp) {
        this.diariaHosp = diariaHosp;
    }
}
