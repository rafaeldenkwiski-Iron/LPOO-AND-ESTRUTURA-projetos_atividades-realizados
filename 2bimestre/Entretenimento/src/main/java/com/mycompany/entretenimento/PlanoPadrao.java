/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entretenimento;

/**
 *
 * @author rafae
 */

public class PlanoPadrao extends ContaStreaming {

    private boolean resolucaoHD;
    private int numero_usuario;

    public PlanoPadrao(String nome, String email,
                       boolean resolucaoHD, int numero_usuario) {
        super(nome, email);
        this.resolucaoHD = resolucaoHD;
        this.numero_usuario = numero_usuario;
    }


    @Override
    public void configurarPlano() {
        setTelas_simultaneas(2);
        setResolucaoHD(false);
    }

    @Override
    public double calcularMensalidade() {
        return getMensalidade() + getNumero_usuario() * 10;
    }

    @Override
    public void exibirFichaConta() {
        System.out.println("=== PLANO PADRAO ===");
        System.out.println("Titular: " + getNome_titular());
        System.out.println("Email: " + getEmail());
        System.out.println("Telas Ativas: " + getTelas_simultaneas());
        System.out.println("Resolucao HD: " + isResolucaoHD());
        System.out.println("Numero de usuarios: " + getNumero_usuario());
        System.out.println("Mensalidade: R$ " + calcularMensalidade());
    }

    /**
     * @return the resolucaoHD
     */
    public boolean isResolucaoHD() {
        return resolucaoHD;
    }

    /**
     * @param resolucaoHD the resolucaoHD to set
     */
    public void setResolucaoHD(boolean resolucaoHD) {
        this.resolucaoHD = resolucaoHD;
    }

    /**
     * @return the numero_usuario
     */
    public int getNumero_usuario() {
        return numero_usuario;
    }

    /**
     * @param numero_usuario the numero_usuario to set
     */
    public void setNumero_usuario(int numero_usuario) {
        this.numero_usuario = numero_usuario;
    }
}
