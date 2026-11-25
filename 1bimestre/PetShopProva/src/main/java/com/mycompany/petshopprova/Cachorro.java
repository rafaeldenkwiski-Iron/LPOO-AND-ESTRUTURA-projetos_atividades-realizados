/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshopprova;

/**
 *
 * @author LAB3
 */
public class Cachorro extends Animal{
    private String cartVacina;
    private double recreacao;
    
    
    public Cachorro(String pet_nome, String dono_nome,double diariaHosp, String vacina, double recreacaoAds){
    super(pet_nome, dono_nome, diariaHosp);
    cartVacina=vacina;
    recreacao=recreacaoAds;    
    };

    @Override
    public double calcularPagamentoFinal(){
        return super.getDiariaHosp()+getRecreacao();
    };
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("CARTERINHA DA VACINACAO: "+getCartVacina());
        System.out.println("TAXA ADESTRACAO/RECREACAO: "+getRecreacao());
        System.out.println("VALOR FINAL: "+this.calcularPagamentoFinal());
    };
    
    /**
     * @return the cartVacina
     */
    public String getCartVacina() {
        return cartVacina;
    }

    /**
     * @param cartVacina the cartVacina to set
     */
    public void setCartVacina(String cartVacina) {
        this.cartVacina = cartVacina;
    }

    /**
     * @return the recreacao
     */
    public double getRecreacao() {
        return recreacao;
    }

    /**
     * @param recreacao the recreacao to set
     */
    public void setRecreacao(double recreacao) {
        this.recreacao = recreacao;
    }
}
