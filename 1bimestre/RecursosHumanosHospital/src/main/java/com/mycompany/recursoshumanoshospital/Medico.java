/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursoshumanoshospital;

/**
 *
 * @author LAB3
 */
public class Medico extends Pessoa{
    private String crm;
    private double bonificacao;
    
    public Medico(String nomePessoa, String cpfPessoa, double salarioPessoa ,String crmMedico, double bonificacaoMedico){
        super(nomePessoa,cpfPessoa,salarioPessoa);
        crm=crmMedico;
        bonificacao=bonificacaoMedico;
    }

    @Override
    public double calcularSalarioFinal(){
        return super.getSalario()+getBonificacao();
        
    };
    
    @Override
    public void exibirFicha(){
        super.exibirFicha();
        System.out.println("=== DADOS DO MEDICO ===");
        System.out.println("CPF: "+getCpf());
        System.out.println("SALARIO LIQUEDO: "+this.calcularSalarioFinal());
    };
    
    /**
     * @return the crm
     */
    public String getCrm() {
        return crm;
    }

    /**
     * @param crm the crm to set
     */
    public void setCrm(String crm) {
        this.crm = crm;
    }

    /**
     * @return the bonificacao
     */
    public double getBonificacao() {
        return bonificacao;
    }

    /**
     * @param bonificacao the bonificacao to set
     */
    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
}
