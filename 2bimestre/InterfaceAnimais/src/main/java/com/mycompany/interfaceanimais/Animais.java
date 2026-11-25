/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceanimais;

/**
 *
 * @author rafae
 */
public abstract class Animais {
    private String nome;
    private int idade;
    
    public Animais(String NomeAnimal, int IdadeAnimal){
        this.nome=NomeAnimal;
        this.idade=IdadeAnimal;
    }
    
    public abstract void emitirSom();
    public abstract void comer();
    public abstract void brincarComHumanos();
    
    public void envelhecer(){
        setIdade(getIdade()+1);
        System.out.println(getNome()+" agora tem "+getIdade()+" anos.");
    }

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
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
