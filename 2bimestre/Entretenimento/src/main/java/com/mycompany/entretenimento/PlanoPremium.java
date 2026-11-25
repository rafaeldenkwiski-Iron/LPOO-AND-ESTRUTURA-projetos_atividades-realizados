/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entretenimento;

/**
 *
 * @author rafae
 */

public class PlanoPremium extends ContaStreaming {

    private String cupom_convite;

    public PlanoPremium(String nome, String email, String cupom_convite) {
        super(nome, email);
        this.cupom_convite = cupom_convite;
    }

    @Override
    public void configurarPlano() {
        setTelas_simultaneas(4);
    }

    @Override
    public double calcularMensalidade() {
        return getMensalidade() * 1.20;
    }

    @Override
    public void exibirFichaConta() {
        System.out.println("=== PLANO PREMIUM ===");
        System.out.println("Titular: " + getNome_titular());
        System.out.println("Email: " + getEmail());
        System.out.println("Telas Ativas: " + getTelas_simultaneas());
        System.out.println("Cupom de convite: " + getCupom_convite());
        System.out.println("Resolucao: Ultra 4K");
        System.out.println("Mensalidade: R$ " + calcularMensalidade());
    }

    /**
     * @return the cupom_convite
     */
    public String getCupom_convite() {
        return cupom_convite;
    }

    /**
     * @param cupom_convite the cupom_convite to set
     */
    public void setCupom_convite(String cupom_convite) {
        this.cupom_convite = cupom_convite;
    }
}

