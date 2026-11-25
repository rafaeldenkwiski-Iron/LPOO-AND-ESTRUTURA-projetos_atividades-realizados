/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursoshumanoshospital;

/**
 *
 * @author LAB3
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private double salario;
    
    
    public Pessoa(String nomePessoa, String cpfPessoa,double salarioPessao){
    nome=nomePessoa;
    cpf=cpfPessoa;
    salario=salarioPessao;
    };
    
    public void exibirFicha(){
        System.out.println("=== DADOOS DA PESSOA ===");
        System.out.println("NOME: "+getNome());
        System.out.println("CPF: "+getCpf());
        System.out.println("SALARIO: "+getSalario());
    };

    public double calcularSalarioFinal(){
        return getSalario();
    };
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

}
