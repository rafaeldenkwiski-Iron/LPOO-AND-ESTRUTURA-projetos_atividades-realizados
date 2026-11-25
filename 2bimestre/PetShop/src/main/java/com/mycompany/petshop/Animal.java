/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.petshop;

/**
 *
 * @author rafae
 */
public class Animal {
private String nomeAnimal;
private String nomeDono;
private double valorDiaria;

public Animal(String nomeA, String nomeD, double valorD){
    this.nomeAnimal=nomeA;
    this.nomeDono=nomeD;
    this.valorDiaria=valorD;
}

public void exibirInformacoes(){
    System.out.println("===DADOS DO ANIMAL===");
    System.out.println("NOME DO ANIMAL: "+this.nomeAnimal);
    System.out.println("NOME DO DONO: "+this.nomeDono);
    System.out.println("VALOR BASE r$: "+this.valorDiaria);
}

    public double calcularPagamentoFinal(){
    return valorDiaria;
    }

    /**
     * @return the nomeAnimal
     */
    public String getNomeAnimal() {
        return nomeAnimal;
    }

    /**
     * @param nomeAnimal the nomeAnimal to set
     */
    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    /**
     * @return the nomeDono
     */
    public String getNomeDono() {
        return nomeDono;
    }

    /**
     * @param nomeDono the nomeDono to set
     */
    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    /**
     * @return the valorDiaria
     */
    public double getValorDiaria() {
        return valorDiaria;
    }

    /**
     * @param valorDiaria the valorDiaria to set
     */
    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }


}
