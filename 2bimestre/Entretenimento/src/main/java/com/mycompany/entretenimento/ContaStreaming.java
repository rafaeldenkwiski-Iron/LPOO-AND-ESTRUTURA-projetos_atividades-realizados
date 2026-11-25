/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entretenimento;

/**
 *
 * @author rafae
 */

public abstract class ContaStreaming {

    private String nome_titular;
    private String email;
    private int telas_simultaneas;
    private double mensalidade;

    public ContaStreaming(String nome_titular, String email) {
        this.nome_titular = nome_titular;
        this.email = email;
        this.telas_simultaneas = 0;
        this.mensalidade = 43.0;
    }

    public abstract void configurarPlano();

    public abstract double calcularMensalidade();

    public abstract void exibirFichaConta();

    /**
     * @return the nome_titular
     */
    public String getNome_titular() {
        return nome_titular;
    }

    /**
     * @param nome_titular the nome_titular to set
     */
    public void setNome_titular(String nome_titular) {
        this.nome_titular = nome_titular;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telas_simultaneas
     */
    public int getTelas_simultaneas() {
        return telas_simultaneas;
    }

    /**
     * @param telas_simultaneas the telas_simultaneas to set
     */
    public void setTelas_simultaneas(int telas_simultaneas) {
        this.telas_simultaneas = telas_simultaneas;
    }

    /**
     * @return the mensalidade
     */
    public double getMensalidade() {
        return mensalidade;
    }

    /**
     * @param mensalidade the mensalidade to set
     */
    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    
}
