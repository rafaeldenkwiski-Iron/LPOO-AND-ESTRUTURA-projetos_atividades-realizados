/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursoshumanoshospital;

/**
 *
 * @author LAB3
 */
public class Enfermeiro extends Pessoa{
    private String coren;
    private int horaExtras;
    
    public Enfermeiro(String nomePessao, String cpfPessoa, double salarioPessoa, 
        String corenEnfermeiro, int horaExtrasEnfermeiro){
        
        super(nomePessao, cpfPessoa, salarioPessoa);
        coren=corenEnfermeiro;
        horaExtras=horaExtrasEnfermeiro;
       
    }
    
    @Override
    public double calcularSalarioFinal(){
        return super.getSalario()+getHoraExtras()*50;
        
    };
    
    @Override
    public void exibirFicha(){
        super.exibirFicha();
        System.out.println("=== DADOS DO ENFERMEIRO ===");
        System.out.println("COREN: "+getCoren());
        System.out.println("SALARIO LIQUEDO: "+this.calcularSalarioFinal());
    };

    /**
     * @return the coren
     */
    public String getCoren() {
        return coren;
    }

    /**
     * @param coren the coren to set
     */
    public void setCoren(String coren) {
        this.coren = coren;
    }

    /**
     * @return the horaExtras
     */
    public int getHoraExtras() {
        return horaExtras;
    }

    /**
     * @param horaExtras the horaExtras to set
     */
    public void setHoraExtras(int horaExtras) {
        this.horaExtras = horaExtras;
    }
}
