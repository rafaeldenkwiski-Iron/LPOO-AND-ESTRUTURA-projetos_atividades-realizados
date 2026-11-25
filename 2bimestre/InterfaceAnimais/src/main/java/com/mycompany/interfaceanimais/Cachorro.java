/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceanimais;

/**
 *
 * @author rafae
 */
public class Cachorro extends Animais{

    
    public Cachorro(String NomeAnimal, int IdadeAnimal) {
        super(NomeAnimal, IdadeAnimal);
    }

    @Override
    public void emitirSom() {
        System.out.println(super.getNome()+" latiu! Au Au");
    }

    @Override
    public void comer() {
        System.out.println(super.getNome()+" esta comendo!");
    }

    @Override
    public void brincarComHumanos() {
        System.out.println(super.getNome()+" esta pega a bolinha!");
    }
    
}
