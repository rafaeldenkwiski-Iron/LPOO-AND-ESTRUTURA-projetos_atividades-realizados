/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceanimais;

/**
 *
 * @author rafae
 */
public class Leao extends Animais implements Selvagem,Mamiferos{

    public Leao(String NomeAnimal, int IdadeAnimal) {
        super(NomeAnimal, IdadeAnimal);
    }

    @Override
    public void emitirSom() {
        System.out.println(super.getNome()+" esta rugindo ROARORAORORAARRROO");
    }

    @Override
    public void comer() {
        System.out.println(super.getNome()+" esta comendo!");
    }

    @Override
    public void brincarComHumanos() {
        System.out.println(super.getNome()+" Alerta! Leao é um animal selvagem, cuidado!");
    }

    @Override
    public void cacar() {
        System.err.println(super.getNome()+" esta espreitando a sua presa");
    }

    @Override
    public void amamentarFilhote() {
        System.out.println(super.getNome()+" esta amamentando seu filhote");
    }
    
}
