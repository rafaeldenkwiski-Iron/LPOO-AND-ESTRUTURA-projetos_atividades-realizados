/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceanimais;

/**
 *
 * @author rafae
 */
public class Cavalo extends Animais implements Montaria{

    public Cavalo(String NomeAnimal, int IdadeAnimal) {
        super(NomeAnimal, IdadeAnimal);
    }

    @Override
    public void emitirSom() {
        System.out.println(super.getNome()+" esta relinchando! iiirrrririiririrriiirrr");
    }

    @Override
    public void comer() {
        System.out.println(super.getNome()+" esta comendo");
    }

    @Override
    public void brincarComHumanos() {
        System.out.println(super.getNome()+" recebeu torrao de acucar e esta feliz");
    }

    @Override
    public void galopar() {
        if(super.getIdade()<idadeParaMontar){
            System.out.println(super.getNome()+" é muito jovem para galopar! idade minima "+idadeParaMontar+" anos.");
        }else{
            System.out.println(super.getNome()+" esta galopando pelos campos. Cuidado "
                    + "para nao ultrapassar velocidade máxima "+ velocidadeLimiteGalope+" km/h");
        }
    }
    
}
